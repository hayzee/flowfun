(ns flowfun.utilities.css)

(def doc-root
  (.-documentElement js/document))

(defn add-class
  [el class]
  (.add (.-classList el) class))

(defn remove-class
  [el class]
  (.remove (.-classList el) class))

(defn toggle-class
  [el class]
  (.toggle (.-classList el) class))
