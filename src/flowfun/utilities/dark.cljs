(ns flowfun.utilities.dark
  (:require [flowfun.local :as local]
            [flowfun.utilities.css :as css]))

(def dark-class "dark")

(defn show-icon
  ":dark show dark icon in nav
  :light show light icon in nav"
  [mode]
  (case mode
    :light (do
             (css/remove-class (.getElementById js/document "theme-toggle-dark-icon") "hidden")
             (css/add-class (.getElementById js/document "theme-toggle-light-icon") "hidden"))
    :dark (do
            (css/add-class (.getElementById js/document "theme-toggle-dark-icon") "hidden")
            (css/remove-class (.getElementById js/document "theme-toggle-light-icon") "hidden"))))

(defn init-dark
  []
  (if (local/get-item dark-class)
    (do
      (show-icon :dark)
      (css/add-class css/doc-root dark-class))
    (show-icon :light)))

(defn toggle-dark
  [_]
  (if (local/get-item dark-class)
    (do
      (show-icon :light)
      (css/remove-class css/doc-root dark-class)
      (local/remove-item dark-class))
    (do
      (show-icon :dark)
      (css/add-class css/doc-root dark-class)
      (local/set-item dark-class true))))
