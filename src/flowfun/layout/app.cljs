(ns flowfun.layout.app
  (:require [flowfun.layout.nav :as nav]
            [flowfun.layout.sidebar :as sidebar]
            [flowfun.layout.panel :as panel]
            [flowfun.components.modals.confirm :as confirm]))

(defn component
  []
  [:<>

   ; top nav
   [nav/component]

   ; left menu
   [sidebar/component]

   ; main content
   [panel/component]

   ; modal
   [confirm/modal-container]])
