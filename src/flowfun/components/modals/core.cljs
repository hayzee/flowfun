(ns flowfun.components.modals.core
  [:require [flowfun.components.modals.confirm :as confirm]
            [flowfun.components.toast.core :as toast]
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
                  (toast/create-toast "I'll take that as a No!" :color "yellow")
                  (set-modal nil))
    :f-on-yes (fn [e]
                (toast/create-toast "Excellent News." :color "green")
                (set-modal nil)
                #_(set! (.-location js/window) "http://www.google.com"))
    :f-on-no (fn [e]
               (toast/create-toast "That is a terrible shame." :color "red")
               (set-modal nil))))

(comment
  ; e.g.

  (set-modal are-you-well-modal)

  (set-modal nil)


  )

