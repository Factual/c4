(defproject factual/c4 "0.2.1-SNAPSHOT"
  :description "Convenience features for handling record files the Clojure way"
  :url "https://github.com/Factual/c4"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.4.0"]
                 [fs "1.3.2"]
                 [com.cemerick/pomegranate "0.0.13"]
                 [org.clojure/tools.logging "0.2.3"]
                 [clojure-csv/clojure-csv "2.0.0-alpha2"]
                 [cheshire "5.0.2"]
                 [ordered "1.3.1"]
                 [retry "1.0.2"]
                 [org.apache.httpcomponents/httpclient "4.2.3"]]
  :aliases {"test!" ["do" "clean," "deps," "test" ":all"]}
  :aot :all)
