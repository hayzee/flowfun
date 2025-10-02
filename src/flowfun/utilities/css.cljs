(ns flowfun.utilities.css)

(defn gid
  [id]
  (.getElementById js/document id))

; This sort of thing is a bad idea. Let reagent manage the dom/components
;(defn remove-element
;  [id]
;  (.remove (.getElementById js/document id)))

(defn fadeout
  [id & {:keys [fade-time callback]
         :or {fade-time "1s"}}]
  (when callback
    (.addEventListener (gid id) "transitionend" callback))
  (set! (.. (gid id) -style -transition) (str "opacity " fade-time))
  (set! (.. (gid id) -style -opacity) "00%"))

(defn fadein
  [id]
  (set! (.. (gid id) -style -opacity) "100%"))

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
