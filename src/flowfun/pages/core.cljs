(ns flowfun.pages.core
  (:require [flowfun.pages.example :as example]
            [flowfun.pages.example-02 :as example-02]
            [flowfun.pages.blank :as blank]))

(def example-page "example-page")
(def example-02-page "example-02-page")
(def blank-page "blank-page")

(def pages
  {example-page example/example-page
   example-02-page example-02/example-02-page
   blank-page blank/blank-page})
