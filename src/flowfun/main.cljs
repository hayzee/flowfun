(ns flowfun.main
  (:require [goog.dom :as dom]
            [reagent.dom :as rdom]))

(def app (dom/getElement "app"))

(defn component
  []
  [:div
   [:p "This is a paragraph"]
   [:p "This is a paragraph"]
   [:p "This is a paragraph"]
   [:p "This is a paragraph"]
   ])

(defn start
  []
  (rdom/render [component] app))

(defn stop
  []
  (println "stopped"))

(defn init
  [x]
  (start))
