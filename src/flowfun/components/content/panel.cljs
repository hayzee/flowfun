(ns flowfun.components.content.panel
  (:require [reagent.core :as r]) )

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
  [& {:keys [classes]
      :or {classes ""}}]
  (let [n (r/atom 0)]
    (js/alert "outer")
   (fn [& {:keys [classes]
           :or {classes ""}}]
     (js/alert "inner")
     [:div
      {:class (str "flex items-center justify-center h-36 rounded bg-gray-50 dark:bg-gray-700 " classes)
       :on-click #(swap! n inc)}
      [:p
       {:class "text-2xl text-gray-400 dark:text-gray-500"}
       @n
       ]])))

(defn row-n
  [n-cols & components]
  (let [classes (str "grid grid-cols-"n-cols" gap-1 mb-1")]
    (into [:div
           {:class classes}]
          (or components (repeat n-cols [dummy-content])))))

(defn component
  []
  [:div
   {:class "p-4 sm:ml-64"}
   [:div
    {:class
     "p-4 border-2 border-gray-200 border-dashed rounded-lg dark:border-gray-700 mt-14"}
    [row-n 1]
    [row-n 2]
    [row-n 3 [dummy-content :classes "grid col-span-2"] [dummy-content :classes "grid col-span-1"]]
    [row-n 4]
    [row-n 5 [dummy-content :classes "grid col-span-2"] [dummy-content :classes "grid col-span-3"]]
    [row-n 6]
    [row-n 7]
    [row-n 8 [dummy-content :classes "col-span-2"][dummy-content :classes "col-span-2"][dummy-content :classes "col-span-2"][dummy-content :classes "col-span-2"] ]
    ;[row-n 9]   ; subdivision of 9 doesn't work for some reason.
    [row-n 10]
    [row-n 5 [dummy-content :classes "grid col-span-2"] [dummy-content :classes "grid col-span-3"]]]])