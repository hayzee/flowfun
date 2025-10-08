(ns flowfun.layout.app
  (:require [flowfun.layout.nav :as nav]
            [flowfun.layout.sidebar :as sidebar]
            [flowfun.layout.panel :as panel]
            [flowfun.components.modals.core :as modals]
            [flowfun.components.toast.core :as toast]))

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
   [modals/current-modal]

   ; toast
   [toast/container]])
