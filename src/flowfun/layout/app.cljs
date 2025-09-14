(ns flowfun.layout.app
  (:require [flowfun.layout.nav :as nav]
            [flowfun.layout.sidebar :as sidebar]
            [flowfun.layout.panel :as panel]
            [flowfun.components.modals.confirm :as confirm]))

(defn component
  []
  [:<>
   [nav/component]
   [sidebar/component]
   [panel/component]
   [confirm/component "popup-modal"]])
