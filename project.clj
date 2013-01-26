(defproject factual/c4 "0.0.8"
  :description "Convenience features for handling record files the Clojure way"
  :url "https://github.com/Factual/c4"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :repositories {"foursquareapijava" "http://foursquare-api-java.googlecode.com/svn/repository"}

  :dependencies [[org.clojure/clojure "1.4.0"]
                 [fs "1.3.2"]
                 [com.cemerick/pomegranate "0.0.13"]
                 [factql "1.0.3"]
                 [clojure-csv/clojure-csv "2.0.0-alpha2"]
                 [fi.foyt/foursquare-api "1.0.2"]
                 [cheshire "4.0.1"]
                 [ordered "1.3.1"]
                 [retry "1.0.2"]
                 ;;;; for yelp lib
                 [org.scribe/scribe "1.2.0"]
                 ;;;; for facebook lib
                 [org.clojars.krisajenkins/clj-facebook-graph "0.4.4"]
                 ;;;; for google places API
                 [com.google.api-client/google-api-client "1.8.0-beta"]
                 ;;;;;; forced downgrade, otherwise we get an error about hostname and SSL certificate.
                 ;;;;;; https://issues.apache.org/jira/browse/HTTPCLIENT-1125
                 [org.apache.httpcomponents/httpclient "4.1.1"]])