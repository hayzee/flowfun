(ns flowfun.components.content.panel
  (:require [reagent.core :as r]
            [clojure.edn :as edn]))

;; row-n

(def plus-symbol
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
       :d "M9 1v16M1 9h16"}]])

(defn dummy-content
  []
  (let [n (r/atom 0)]
   (fn []
     [:div
      {:class "flex items-center justify-center h-36 rounded bg-gray-50 dark:bg-gray-700"
       :on-click #(swap! n inc)}
      [:p
       {:class "text-2xl text-gray-400 dark:text-gray-500"}
       @n
       ]])))

(defn row-n
  [n]
  (let [classes (str "grid grid-cols-"n" gap-4 mb-4")]
    (into [:div
           {:class classes}]
          (repeat n [dummy-content]))))

(defn component
  []
  [:div
   {:class "p-4 sm:ml-64"}
   [:div
    {:class
     "p-4 border-2 border-gray-200 border-dashed rounded-lg dark:border-gray-700 mt-14"}
    [row-n 1]
    [row-n 2]
    [row-n 3]
    [row-n 4]
    [row-n 5]
    [row-n 6]
    [row-n 7]
    [row-n 8]
    [row-n 10]]])
