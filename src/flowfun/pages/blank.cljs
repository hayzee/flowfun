(ns flowfun.pages.blank
  (:require [flowfun.components.dummy :as dummy]
            [flowfun.layout.panel-row :as panel-row]))


(defn form-component
  []
  [:div
   {:class "flex items-center justify-center rounded bg-gray-50 dark:bg-gray-700 text-gray-400 dark:text-gray-500"}
   [:form
    {:class "w-full max-w-max mx-auto py-8 px-4"}

    [:div
     {:class "grid md:grid-cols-2 md:gap-6"}

     [:div
      {:class "relative z-0 w-full mb-5 group col-span-1"}
      [:input
       {:type "email",
        :name "floating_email",
        :id "floating_email",
        :class
        "block py-2.5 px-0 w-full text-sm text-gray-900 bg-transparent border-0 border-b-2 border-gray-300 appearance-none dark:text-white dark:border-gray-600 dark:focus:border-blue-500 focus:outline-none focus:ring-0 focus:border-blue-600 peer",
        :placeholder "",
        :required ""}]
      [:label
       {:for "floating_email",
        :class
        "peer-focus:font-medium absolute text-sm text-gray-500 dark:text-gray-400 duration-300 transform -translate-y-6 scale-75 top-3 -z-10 origin-[0] peer-focus:start-0 rtl:peer-focus:translate-x-1/4 rtl:peer-focus:left-auto peer-focus:text-blue-600 peer-focus:dark:text-blue-500 peer-placeholder-shown:scale-100 peer-placeholder-shown:translate-y-0 peer-focus:scale-75 peer-focus:-translate-y-6"}
       "Email address"]]]

    [:div
     {:class "grid md:grid-cols-2 md:gap-6"}


     [:div
      {:class "relative z-0 w-full mb-5 group"}
      [:input
       {:type "password",
        :name "floating_password",
        :id "floating_password",
        :class
        "block py-2.5 px-0 w-full text-sm text-gray-900 bg-transparent border-0 border-b-2 border-gray-300 appearance-none dark:text-white dark:border-gray-600 dark:focus:border-blue-500 focus:outline-none focus:ring-0 focus:border-blue-600 peer",
        :placeholder "",
        :required ""}]
      [:label
       {:for "floating_password",
        :class
        "peer-focus:font-medium absolute text-sm text-gray-500 dark:text-gray-400 duration-300 transform -translate-y-6 scale-75 top-3 -z-10 origin-[0] peer-focus:start-0 rtl:peer-focus:translate-x-1/4 peer-focus:text-blue-600 peer-focus:dark:text-blue-500 peer-placeholder-shown:scale-100 peer-placeholder-shown:translate-y-0 peer-focus:scale-75 peer-focus:-translate-y-6"}
       "Password"]]


     ]
    [:div
     {:class "grid md:grid-cols-2 md:gap-6"}
     [:div
      {:class "relative z-0 w-full mb-5 group"}
      [:input
       {:type        "password",
        :name        "repeat_password",
        :id          "floating_repeat_password",
        :class
        "block py-2.5 px-0 w-full text-sm text-gray-900 bg-transparent border-0 border-b-2 border-gray-300 appearance-none dark:text-white dark:border-gray-600 dark:focus:border-blue-500 focus:outline-none focus:ring-0 focus:border-blue-600 peer",
        :placeholder "",
        :required    ""}]
      [:label
       {:for "floating_repeat_password",
        :class
        "peer-focus:font-medium absolute text-sm text-gray-500 dark:text-gray-400 duration-300 transform -translate-y-6 scale-75 top-3 -z-10 origin-[0] peer-focus:start-0 rtl:peer-focus:translate-x-1/4 peer-focus:text-blue-600 peer-focus:dark:text-blue-500 peer-placeholder-shown:scale-100 peer-placeholder-shown:translate-y-0 peer-focus:scale-75 peer-focus:-translate-y-6"}
       "Confirm password"]]]

    [:div
     {:class "grid md:grid-cols-2 md:gap-6"}
     [:div
      {:class "relative z-0 w-full mb-5 group col-span-1"}
      [:input
       {:type "text",
        :name "floating_first_name",
        :id "floating_first_name",
        :class
        "block py-2.5 px-0 w-full text-sm text-gray-900 bg-transparent border-0 border-b-2 border-gray-300 appearance-none dark:text-white dark:border-gray-600 dark:focus:border-blue-500 focus:outline-none focus:ring-0 focus:border-blue-600 peer",
        :placeholder "",
        :required ""}]
      [:label
       {:for "floating_first_name",
        :class
        "peer-focus:font-medium absolute text-sm text-gray-500 dark:text-gray-400 duration-300 transform -translate-y-6 scale-75 top-3 -z-10 origin-[0] peer-focus:start-0 rtl:peer-focus:translate-x-1/4 peer-focus:text-blue-600 peer-focus:dark:text-blue-500 peer-placeholder-shown:scale-100 peer-placeholder-shown:translate-y-0 peer-focus:scale-75 peer-focus:-translate-y-6"}
       "First name"]]
     [:div
      {:class "relative z-0 w-full mb-5 group"}
      [:input
       {:type "text",
        :name "floating_last_name",
        :id "floating_last_name",
        :class
        "block py-2.5 px-0 w-full text-sm text-gray-900 bg-transparent border-0 border-b-2 border-gray-300 appearance-none dark:text-white dark:border-gray-600 dark:focus:border-blue-500 focus:outline-none focus:ring-0 focus:border-blue-600 peer",
        :placeholder "",
        :required ""}]
      [:label
       {:for "floating_last_name",
        :class
        "peer-focus:font-medium absolute text-sm text-gray-500 dark:text-gray-400 duration-300 transform -translate-y-6 scale-75 top-3 -z-10 origin-[0] peer-focus:start-0 rtl:peer-focus:translate-x-1/4 peer-focus:text-blue-600 peer-focus:dark:text-blue-500 peer-placeholder-shown:scale-100 peer-placeholder-shown:translate-y-0 peer-focus:scale-75 peer-focus:-translate-y-6"}
       "Last name"]]]
    [:div
     {:class "grid md:grid-cols-2 md:gap-6"}
     [:div
      {:class "relative z-0 w-full mb-5 group"}
      [:input
       {:type "tel",
        :pattern "[0-9]{3}-[0-9]{3}-[0-9]{4}",
        :name "floating_phone",
        :id "floating_phone",
        :class
        "block py-2.5 px-0 w-full text-sm text-gray-900 bg-transparent border-0 border-b-2 border-gray-300 appearance-none dark:text-white dark:border-gray-600 dark:focus:border-blue-500 focus:outline-none focus:ring-0 focus:border-blue-600 peer",
        :placeholder "",
        :required ""}]
      [:label
       {:for "floating_phone",
        :class
        "peer-focus:font-medium absolute text-sm text-gray-500 dark:text-gray-400 duration-300 transform -translate-y-6 scale-75 top-3 -z-10 origin-[0] peer-focus:start-0 rtl:peer-focus:translate-x-1/4 peer-focus:text-blue-600 peer-focus:dark:text-blue-500 peer-placeholder-shown:scale-100 peer-placeholder-shown:translate-y-0 peer-focus:scale-75 peer-focus:-translate-y-6"}
       "Phone number (123-456-7890)"]]
     [:div
      {:class "relative z-0 w-full mb-5 group"}
      [:input
       {:type "text",
        :name "floating_company",
        :id "floating_company",
        :class
        "block py-2.5 px-0 w-full text-sm text-gray-900 bg-transparent border-0 border-b-2 border-gray-300 appearance-none dark:text-white dark:border-gray-600 dark:focus:border-blue-500 focus:outline-none focus:ring-0 focus:border-blue-600 peer",
        :placeholder "",
        :required ""}]
      [:label
       {:for "floating_company",
        :class
        "peer-focus:font-medium absolute text-sm text-gray-500 dark:text-gray-400 duration-300 transform -translate-y-6 scale-75 top-3 -z-10 origin-[0] peer-focus:start-0 rtl:peer-focus:translate-x-1/4 peer-focus:text-blue-600 peer-focus:dark:text-blue-500 peer-placeholder-shown:scale-100 peer-placeholder-shown:translate-y-0 peer-focus:scale-75 peer-focus:-translate-y-6"}
       "Company (Ex. Google)"]]]
    [:button
     {:type "submit",
      :class
      "text-white bg-blue-700 hover:bg-blue-800 focus:ring-4 focus:outline-none focus:ring-blue-300 font-medium rounded-lg text-sm w-full sm:w-auto px-5 py-2.5 text-center dark:bg-blue-600 dark:hover:bg-blue-700 dark:focus:ring-blue-800"}
     "Submit"]]])

(defn blank-page
  []
  [:div
   {:class
    "px-4 pt-4 border-2 border-gray-200 border-dashed rounded-lg dark:border-gray-700 mt-14"}
   [panel-row/row-of-n 1 [form-component]]])
