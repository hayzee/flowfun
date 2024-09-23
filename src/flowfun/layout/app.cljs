(ns flowfun.components.layout.app
  (:require [flowfun.components.layout.nav :as nav]
            [flowfun.components.layout.sidebar :as sidebar]
            [flowfun.components.layout.panel :as panel]))

(defn component
  []
  [:viewport
   [nav/component]
   [sidebar/component]
   [panel/component]])
