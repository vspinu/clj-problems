(ns cljproj.dep
  (:require
   [clojure.core.async :as a]
   [cljproj.core :refer [tt]]))

(defn pp []
  (tt (a/chan)))
