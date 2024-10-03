(ns flowfun.layout.panel
  (:require [flowfun.pages.core :as pages-core]
            [reagent.core :as r]
            [flowfun.state :as state]))

(defn component
  []
  [:div
   {:class "mt-2 p-4 sm:ml-64"}
   [(get pages-core/pages (:current-page @state/app))]])
