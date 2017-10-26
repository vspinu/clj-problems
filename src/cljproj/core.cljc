(ns cljproj.core
  (:require
   [clojure.core.async :as a :refer [>! <!]])
  #?(:cljs
     (:require-macros
      [cljproj.core]
      [cljs.core.async.macros :as a])))

(defmacro tt [ch]
  `(a/go (println (<! ~ch))))
