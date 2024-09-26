(ns flowfun.utilities.dark
  (:require [flowfun.local :as local]
            [flowfun.utilities.css :as css]))

(def dark-class "dark")

(defn init-dark
  []
  (when (local/get-item dark-class)
    (css/add-class css/doc-root dark-class)))

(defn toggle-dark
  [_]
  (if (local/get-item dark-class)
    (do
      (css/remove-class css/doc-root dark-class)
      (local/remove-item dark-class))
    (do
      (css/add-class css/doc-root dark-class)
      (local/set-item dark-class true))))
