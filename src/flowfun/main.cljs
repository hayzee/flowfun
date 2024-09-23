(ns flowfun.main
  (:require [goog.dom :as dom]
            [reagent.dom :as rdom]
            [flowfun.layout.app :as app]
            [flowfun.utilitiles.dark :as dark]))

(def app (dom/getElement "app"))

; Lifecycle hooks

(defn start
  []
  (println "starting")
  (rdom/render [app/component] app)
  (println "started")
  (dark/init-dark))

(defn stop
  []
  (println "stopped"))

; Init function

(defn init
  [x]
  (start))
