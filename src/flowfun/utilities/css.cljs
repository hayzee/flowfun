(ns flowfun.utilities.css)

(defn gid
  [id]
  (.getElementById js/document id))

(defn remove-element
  [id]
  (.remove (.getElementById js/document id)))

(defn fadeout
  [id & {:keys [fade-time remove]
         :or {fade-time "1s"
              remove true}}]
  (when remove
   (.addEventListener (gid id) "transitionend" (fn [e] (remove-element id))))
  (set! (.. (gid id) -style -transition) (str "opacity " fade-time))
  (set! (.. (gid id) -style -opacity) "00%"))

(defn fadein
  [id]
  (do
    #_(set! (.. (gid id) -style -transition) "opacity 5s")
    (set! (.. (gid id) -style -opacity) "100%")))

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
