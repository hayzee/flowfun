(ns flowfun.components.layout.app
  (:require [flowfun.components.layout.nav :as nav]
            [flowfun.components.layout.sidebar :as sidebar]
            [flowfun.components.content.panel :as content]))

(defn component
  []
  [:viewport
   (nav/component)
   (sidebar/component)
   (content/component)])