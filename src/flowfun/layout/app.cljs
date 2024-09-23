(ns flowfun.layout.app
  (:require [flowfun.layout.nav :as nav]
            [flowfun.layout.sidebar :as sidebar]
            [flowfun.layout.panel :as panel]))

(defn component
  []
  [:viewport
   [nav/component]
   [sidebar/component]
   [panel/component]])
