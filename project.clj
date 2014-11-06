(defproject enfocus-demo "0.1.0-SNAPSHOT"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2356"]
                 [enfocus "2.1.1"]]
  :cljsbuild {:builds {:main {:source-paths ["src/cljs"]
                              :compiler {:output-to     "resources/js/script.js"
                                         :optimizations :advanced}}}})
