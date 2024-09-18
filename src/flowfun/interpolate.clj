(ns flowfun.interpolate)

(defn- finterpol
  [s]
  (mapv #(%1 %2)
        (cycle [identity symbol])
        (clojure.string/split s #"\{\{|\}\}")))

(defmacro inter
  [s]
  `(str ~@(finterpol s)))
