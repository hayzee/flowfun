(ns flowfun.layout.panel
  (:require [flowfun.pages.core :as pages-core]
            [reagent.core :as r]
            [flowfun.layout.panel-row :refer [row-of-n]]
            [flowfun.state :as state]
            [flowfun.pages.example :as example]))

(defn component
  []
  [:div
   {:class "mt-2 p-4 sm:ml-64"}
   [(get pages-core/pages (:current-page @state/app))]])
