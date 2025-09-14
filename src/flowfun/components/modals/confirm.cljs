(ns flowfun.components.modals.confirm
  [:require [flowfun.utilities.css :as css]])

;(defn button-thing
;  [modal-element-id]
;  [:button
;   {:data-modal-target modal-element-id
;    :data-modal-toggle modal-element-id
;    :class "block text-white bg-blue-700 hover:bg-blue-800 focus:ring-4 focus:outline-none focus:ring-blue-300 font-medium rounded-lg text-sm px-5 py-2.5 text-center dark:bg-blue-600 dark:hover:bg-blue-700 dark:focus:ring-blue-800"
;    :type  "button"}
;   "Toggle modal"])

(defn component
  [element-id & {:keys [prompt yes-text no-text]
                 :or {prompt "Aye you sure you wish to proceed?"
                      yes-text "OK"
                      no-text "Cancel"}}]
  [:div
   {:id       element-id
    :tabindex "-1"
    :class
    "hidden overflow-y-auto overflow-x-hidden fixed top-0 right-0 left-0 z-50 justify-center items-center w-full md:inset-0 h-[calc(100%-1rem)] max-h-full"}
   [:div
    {:class "relative p-4 w-full max-w-md max-h-full"}
    [:div
     {:class "relative bg-white rounded-lg shadow-sm dark:bg-gray-700"}
     [:button
      {:type            "button"
       :class
       "absolute top-3 end-2.5 text-gray-400 bg-transparent hover:bg-gray-200 hover:text-gray-900 rounded-lg text-sm w-8 h-8 ms-auto inline-flex justify-center items-center dark:hover:bg-gray-600 dark:hover:text-white"
       :data-modal-hide element-id}
      [:svg
       {:class       "w-3 h-3"
        :aria-hidden "true"
        :xmlns       "http://www.w3.org/2000/svg"
        :fill        "none"
        :viewBox     "0 0 14 14"}
       [:path
        {:stroke          "currentColor"
         :stroke-linecap  "round"
         :stroke-linejoin "round"
         :stroke-width    "2"
         :d               "m1 1 6 6m0 0 6 6M7 7l6-6M7 7l-6 6"}]]
      [:span {:class "sr-only"} "Close modal"]]
     [:div
      {:class "p-4 md:p-5 text-center"}
      [:svg
       {:class   "mx-auto mb-4 text-gray-400 w-12 h-12 dark:text-gray-200" `:aria-hidden "true"
        :xmlns   "http://www.w3.org/2000/svg"
        :fill    "none"
        :viewBox "0 0 20 20"}
       [:path
        {:stroke          "currentColor"
         :stroke-linecap  "round"
         :stroke-linejoin "round"
         :stroke-width    "2"
         :d               "M10 11V6m0 8h.01M19 10a9 9 0 1 1-18 0 9 9 0 0 1 18 0Z"}]]
      [:h3
       {:class
        "mb-5 text-lg font-normal text-gray-500 dark:text-gray-400"}
       prompt]
      [:button
       {:data-modal-hide element-id
        :type            "button"
        :class
        ;"text-white bg-red-600 hover:bg-red-800 focus:ring-4 focus:outline-none focus:ring-red-300 dark:focus:ring-red-800 font-medium rounded-lg text-sm inline-flex items-center px-5 py-2.5 text-center"
        "text-white bg-blue-600 hover:bg-blue-800 focus:ring-4 focus:outline-none focus:ring-blue-300 dark:focus:ring-blue-800 font-medium rounded-lg text-sm inline-flex items-center px-5 py-2.5 text-center"
        }
       yes-text]
      [:button
       {:data-modal-hide element-id
        :type            "button"
        :class
        "py-2.5 px-5 ms-3 text-sm font-medium text-gray-900 focus:outline-none bg-white rounded-lg border border-gray-200 hover:bg-gray-100 hover:text-blue-700 focus:z-10 focus:ring-4 focus:ring-gray-100 dark:focus:ring-gray-700 dark:bg-gray-800 dark:text-gray-400 dark:border-gray-600 dark:hover:text-white dark:hover:bg-gray-700"
        :onclick #(js/alert "no")}
       no-text]]]]])

(defn show
  [element-id]
  (css/remove-class (.getElementById js/document element-id) "hidden"))

(defn hide
  [element-id]
  (css/add-class (.getElementById js/document element-id) "hidden"))

(show "popup-modal")

(hide "popup-modal")
