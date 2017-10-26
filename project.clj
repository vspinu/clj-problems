(defproject cljproj "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.9.0-beta3"]
                 [org.clojure/clojurescript "1.9.946"]
                 [org.clojure/core.async "0.3.443"]]

  :source-paths ["src"]

  :profiles {:dev {:dependencies [[com.cemerick/piggieback "0.2.2"]]}
             :1.9.854 {:dependencies [[org.clojure/clojurescript "1.9.854"]]}
             :1.9.946 {:dependencies [[org.clojure/clojurescript "1.9.946"]]}
             :1.9.293 {:dependencies [[org.clojure/clojurescript "1.9.293"]]}}

  :repl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]})
