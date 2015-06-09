(defproject factual/c4 "0.2.1"
  :description "Convenience features for handling record files the Clojure way"
  :url "https://github.com/Factual/c4"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [fs "1.3.2"]
                 [org.clojure/tools.logging "0.2.3"]
                 [clojure-csv/clojure-csv "2.0.1"]
                 [cheshire "5.2.0"]
                 [ordered "1.3.1"]]
  :aliases {"test!" ["do" "clean," "deps," "test" ":all"]}
  :aot :all)
