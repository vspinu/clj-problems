;; (require 'cljs.repl)
(require 'cljs.build.api)

(cljs.build.api/build "src"
                      {:main 'cljproj.dep
                       :output-to "out/main.js"
                       ;; :browser-repl true
                       :optimizations :none
                       :verbose true})

(System/exit 0)
