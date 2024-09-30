(ns flowfun.pages.example-02
  (:require [flowfun.components.dummy :as dummy]
            [flowfun.layout.panel-row :as panel-row]))

(defn example-02-page
  []
  [:div
   {:class
    "px-4 pt-4 border-2 border-gray-200 border-dashed rounded-lg dark:border-gray-700 mt-14"}
   [panel-row/row-of-n 8 [dummy/stateful-component] [dummy/stateful-component] [dummy/stateless-component] [dummy/stateful-component] [dummy/stateful-component] [dummy/stateful-component] [dummy/stateless-component] [dummy/stateful-component]]
   [panel-row/row-of-n 3 [dummy/stateful-component] [dummy/stateless-component] [dummy/stateful-component]]
   [panel-row/row-of-n 2 [dummy/stateful-component] [dummy/stateful-component]]
   [panel-row/row-of-n 1 [dummy/stateless-component]]])
