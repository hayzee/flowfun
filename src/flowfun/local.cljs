(ns flowfun.local)

(defn get-item
  [item]
  (.getItem js/localStorage item))

(defn set-item
  [item value]
  (.setItem js/localStorage item val))

(defn remove-item
  [item]
  (.removeItem js/localStorage item))

(defn clear
  [item value]
  (.clear js/localStorage))

