(ns flowfun.pages.example-02
  (:require [flowfun.components.dummy :as dummy]
            [flowfun.components.panel-row :as panel-row]))

(defn example-page
  []
  [:div
   {:class
    "p-4 border-2 border-gray-200 border-dashed rounded-lg dark:border-gray-700 mt-14"}
   [panel-row/row-n 1 [dummy/stateless]]
   [panel-row/row-n 2 [dummy/stateful] [dummy/stateful]]
   [panel-row/row-n 3 [dummy/stateful] [dummy/stateless] [dummy/stateful]]
   [panel-row/row-n 8 [dummy/stateful] [dummy/stateful] [dummy/stateless] [dummy/stateful] [dummy/stateful] [dummy/stateful] [dummy/stateless] [dummy/stateful]]])
