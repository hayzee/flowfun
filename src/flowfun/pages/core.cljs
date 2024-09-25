(ns flowfun.pages.core
  (:require [flowfun.pages.example :as example]
            [flowfun.pages.example-02 :as example-02]))

(def example-page "example-page")
(def example-02-page "example-02-page")

(def pages
  {example-page example/example-page
   example-02-page example-02/example-02-page})
