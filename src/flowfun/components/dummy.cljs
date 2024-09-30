(ns flowfun.components.dummy
  (:require [reagent.core :as r]
            [reagent.dom :as rd]))

(defn stateless-component
  []
  [:div
   {:class "flex items-center justify-center h-36 rounded bg-gray-50 dark:bg-gray-700 text-gray-400 dark:text-gray-500"}
   [:svg
    {:class "w-3.5 h-3.5",
     :aria-hidden "true",
     :xmlns "http://www.w3.org/2000/svg",
     :fill "none",
     :viewBox "0 0 18 18"}
    [:path
     {:stroke "currentColor",
      :stroke-linecap "round",
      :stroke-linejoin "round",
      :stroke-width "2",
      :d "M9 1v16M1 9h16"}]]])

(defn stateful-component
  []
  (let [n (r/atom 0)]
    (fn []
      [:div
       {:class "flex items-center justify-center h-36 rounded bg-gray-50 dark:bg-gray-700"
        :on-click #(swap! n inc)}
       [:p
        {:class "text-2xl text-gray-400 dark:text-gray-500"}
        @n]])))

(defn class-component
  []
  (let [ref (atom nil)
        ref-fn #(reset! ref %)]
    (r/create-class
      {:display-name "three-canvas"
       :reagent-render
       (fn []
         [:div
          {:ref ref-fn
           :class "flex items-center justify-center h-36 rounded bg-gray-50 dark:bg-gray-700"}
          [:p
           {:class "text-2xl text-gray-400 dark:text-gray-500"}
           "I am a class component"]])
       :component-will-mount
       (fn [this_]
         (js/console.log "component-will-mount"))
       :component-did-mount
       (fn [this_]
         (js/console.log "component-did-mount"))
       :component-will-unmount
       (fn [this_]
         (js/console.log "component-will-unmount"))})))
