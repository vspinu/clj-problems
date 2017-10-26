(ns cljproj.core
  (:require
   #?(:clj  [clojure.core.async :refer [go >! <!]]
      :cljs [cljs.core.async :as a :refer [>! <!]]))
  #?(:cljs
     (:require-macros
      [cljproj.core]
      [cljs.core.async.macros :as am :refer [go]])))

(defmacro tt [ch]
  `(go (println (<! ~ch))))
