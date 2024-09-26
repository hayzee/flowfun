(ns flowfun.main
  (:require [goog.dom :as dom]
            [reagent.dom :as rdom]
            [flowfun.layout.app :as app]
            [flowfun.utilities.dark :as dark]))

(def app (dom/getElement "app"))

; Lifecycle start/stop

(defn start
  []
  (println "starting")
  (rdom/render [app/component] app)
  (dark/init-dark)
  (println "started"))

(defn stop
  []
  (println "stopped"))

; Init function

(defn init
  [x]
  (start))
