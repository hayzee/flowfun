(ns flowfun.layout.panel
  (:require [reagent.core :as r]
            [flowfun.components.panel-row :refer [row-n]]
            [flowfun.state :as state]
            [flowfun.pages.example :as example]))

;; row-n

(defn form-content
  []
  [:div
   {:class "flex h-auto rounded bg-gray-50 dark:bg-gray-700 py-8"}
   [:form
    {:class "max-w-sm mx-auto"}
    [:div
     {:class "mb-5"}
     [:label
      {:for "email",
       :class
       "block mb-2 text-sm font-medium text-gray-900 dark:text-white"}
      "Your email"]
     [:input
      {:type        "email",
       :id          "email",
       :class
       "bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500",
       :placeholder "name@flowbite.com",
       :required    ""}]]
    [:div
     {:class "mb-5"}
     [:label
      {:for "password",
       :class
       "block mb-2 text-sm font-medium text-gray-900 dark:text-white"}
      "Your password"]
     [:input
      {:type     "password",
       :id       "password",
       :class
       "bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500",
       :required ""}]]
    [:div
     {:class "flex items-start mb-5"}
     [:div
      {:class "flex items-center h-5"}
      [:input
       {:id       "remember",
        :type     "checkbox",
        :value    "",
        :class
        "w-4 h-4 border border-gray-300 rounded bg-gray-50 focus:ring-3 focus:ring-blue-300 dark:bg-gray-700 dark:border-gray-600 dark:focus:ring-blue-600 dark:ring-offset-gray-800 dark:focus:ring-offset-gray-800",
        :required ""}]]
     [:label
      {:for   "remember",
       :class "ms-2 text-sm font-medium text-gray-900 dark:text-gray-300"}
      "Remember me"]]
    [:button
     {:type "submit",
      :class
      "text-white bg-blue-700 hover:bg-blue-800 focus:ring-4 focus:outline-none focus:ring-blue-300 font-medium rounded-lg text-sm w-full sm:w-auto px-5 py-2.5 text-center dark:bg-blue-600 dark:hover:bg-blue-700 dark:focus:ring-blue-800"}
     "Submit"]]])


(defn start-page
  []
  [:div
   {:class
    "p-4 border-2 border-gray-200 border-dashed rounded-lg dark:border-gray-700 mt-14"}
   [row-n 1]])

(defn some-other-page
  []
  [:div
   {:class
    "p-4 border-2 border-gray-200 border-dashed rounded-lg dark:border-gray-700 mt-14"}
   [row-n 1 [form-content]]
   [row-n 2 [form-content] [form-content]]
   [row-n 3 [form-content] [form-content] [form-content]]
   [row-n 4 [form-content] [form-content] [form-content] [form-content]]])

(defn form-layout
  []
  [:section
   {:class "bg-white dark:bg-gray-900"}
   [:div
    {:class "py-8 px-4 mx-auto max-w-2xl lg:py-16"}
    [:h2
     {:class "mb-4 text-xl font-bold text-gray-900 dark:text-white"}
     "Add a new product"]
    [:form
     {:action "#"}
     [:div
      {:class "grid gap-4 sm:grid-cols-3 sm:gap-6"}
      [:div
       {:class "sm:col-span-2"}
       [:label
        {:for "name",
         :class
         "block mb-2 text-sm font-medium text-gray-900 dark:text-white"}
        "Product Name"]
       [:input
        {:type "text",
         :name "name",
         :id "name",
         :class
         "bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-primary-500 dark:focus:border-primary-500",
         :placeholder "Type product name",
         :required ""}]]
      [:div
       {:class "w-full"}
       [:label
        {:for "brand",
         :class
         "block mb-2 text-sm font-medium text-gray-900 dark:text-white"}
        "Brand"]
       [:input
        {:type "text",
         :name "brand",
         :id "brand",
         :class
         "bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-primary-500 dark:focus:border-primary-500",
         :placeholder "Product brand",
         :required ""}]]
      [:div
       {:class "w-full"}
       [:label
        {:for "price",
         :class
         "block mb-2 text-sm font-medium text-gray-900 dark:text-white"}
        "Price"]
       [:input
        {:type "number",
         :name "price",
         :id "price",
         :class
         "bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-primary-500 dark:focus:border-primary-500",
         :placeholder "$2999",
         :required ""}]]
      [:div
       [:label
        {:for "category",
         :class
         "block mb-2 text-sm font-medium text-gray-900 dark:text-white"}
        "Category"]
       [:select
        {:id "category",
         :class
         "bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-primary-500 focus:border-primary-500 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-primary-500 dark:focus:border-primary-500"}
        [:option {:selected ""} "Select category"]
        [:option {:value "TV"} "TV/Monitors"]
        [:option {:value "PC"} "PC"]
        [:option {:value "GA"} "Gaming/Console"]
        [:option {:value "PH"} "Phones"]]]
      [:div
       [:label
        {:for "item-weight",
         :class
         "block mb-2 text-sm font-medium text-gray-900 dark:text-white"}
        "Item Weight (kg)"]
       [:input
        {:type "number",
         :name "item-weight",
         :id "item-weight",
         :class
         "bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-primary-500 dark:focus:border-primary-500",
         :placeholder "12",
         :required ""}]]
      [:div
       {:class "sm:col-span-2"}
       [:label
        {:for "description",
         :class
         "block mb-2 text-sm font-medium text-gray-900 dark:text-white"}
        "Description"]
       [:textarea
        {:id "description",
         :rows "8",
         :class
         "block p-2.5 w-full text-sm text-gray-900 bg-gray-50 rounded-lg border border-gray-300 focus:ring-primary-500 focus:border-primary-500 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-primary-500 dark:focus:border-primary-500",
         :placeholder "Your description here"}]]]
     [:button
      {:type "submit",
       :class
       "inline-flex items-center px-5 py-2.5 mt-4 sm:mt-6 text-sm font-medium text-center text-white bg-primary-700 rounded-lg focus:ring-4 focus:ring-primary-200 dark:focus:ring-primary-900 hover:bg-primary-800"}
      "Add product"]]]])

(defn form-page
  []
  [:div
   {:class
    "p-4 border-2 border-gray-200 border-dashed rounded-lg dark:border-gray-700 mt-14"}
   [form-layout]])

(defn component
  []
  [:div
   {:class "p-4 sm:ml-64"}
   (case (:current-page @state/app)
     "example-page" [example/example-page]
     "start-page" [start-page]
     "some-other-page" [some-other-page]
     "form-page" [form-page])])
