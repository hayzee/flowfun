(ns flowfun.state
  (:require [reagent.core :as r]))

(def app
  (r/atom {:current-page "example-page"}))

(defn set-current-page
  [page-name]
  (swap! app assoc :current-page page-name))
