(ns flowfun.components.modals.core
  [:require [flowfun.components.modals.confirm :as confirm]
            [reagent.core :as r]])


(def current-modal-fn
  (r/atom nil))

(defn current-modal
  []
  (deref current-modal-fn))

(defn set-modal
  [modal]
  (swap! current-modal-fn (constantly modal)))


(def are-you-well-modal
  (confirm/component
    "mymodal"
    :prompt "Are you well?"
    :yes-text "Yep"
    :no-text "Nope"
    :f-on-close (fn [e]
                  (js/alert "Cancelled.")
                  (set-modal nil))
    :f-on-yes (fn [e]
                (js/alert "Excellent News.")
                (set-modal nil)
                #_(set! (.-location js/window) "http://www.google.com"))
    :f-on-no (fn [e]
               (js/alert "That is a terrible shame.")
               (set-modal nil))))

(comment
  ; e.g.

  (set-modal are-you-well-modal)

  (set-modal nil)


  )

