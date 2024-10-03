(ns flowfun.local)

(defn get-item
  [item]
  (.getItem js/localStorage item))

(defn set-item
  [item value]
  (.setItem js/localStorage item value))

(defn remove-item
  [item]
  (.removeItem js/localStorage item))

(defn clear
  []
  (.clear js/localStorage))

