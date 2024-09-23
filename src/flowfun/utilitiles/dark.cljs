(ns flowfun.utilitiles.dark
  (:require [flowfun.local :as local]))

(defn init-dark
  []
  (when (local/get-item "dark")
    (.add (.-classList (.-documentElement js/document)) "dark")))

(defn toggle-dark
  [ev]
  (if (local/get-item "dark")
    (do
      (.remove (.-classList (.-documentElement js/document)) "dark")
      (local/remove-item "dark"))
    (do
      (.add (.-classList (.-documentElement js/document)) "dark")
      (local/set-item "dark" true))))
