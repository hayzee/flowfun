(ns flowfun.main
  (:require [goog.dom :as dom]
            [reagent.dom :as rdom]
            [flowfun.components.layout.app :as app]))

(def app (dom/getElement "app"))

; Lifecycle hooks

(defn start
  []
  (println "starting")
  (rdom/render [app/component] app)
  (println "started"))

(defn stop
  []
  (println "stopped"))

; Init function

(defn init
  [x]
  (start))
