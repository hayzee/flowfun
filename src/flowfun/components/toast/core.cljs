(ns flowfun.components.toast.core
  (:require [flowfun.utilities.css :as css]
            [reagent.core :as r]))

(def toasts (r/atom []))

(defn remove-one-toast
  [event]
  (swap! toasts (fn [ts] (vec (remove #(= (.. event -target -id) (:id (second %))) ts)))))

(defn container
  []
  [:div
   {:id    "toast-container"
    :class "right-5 bottom-5 fixed"}
   [:<>
    (for [toast @toasts]
      toast)]])

(defn standard-toast
  [id message & {:keys [color]
                 :or {color "blue"}}]
  [:div
   {:id id
    :key id
    :class
    (str "flex items-center w-full max-w-xs m-2 p-4 text-gray-500 bg-" color "-300 rounded-lg shadow-sm dark:text-gray-400 dark:bg-" color "-900")
    :role "alert"
    :on-click (fn [event_] (css/fadeout id :callback remove-one-toast))}
   [:div {:class "text-sm font-normal"} message]
   [:div
    {:class "z-9999 flex items-center ms-auto space-x-2 rtl:space-x-reverse"}
    [:a
     {:class
      (str "text-sm font-medium text-" color "-600 p-1.5 hover:bg-" color "-100 rounded-lg dark:text-" color "-500 dark:hover:bg-gray-700")
      :href "#"}
     "Undo"]
    [:button
     {:type         "button"
      :class
      "ms-auto -mx-1.5 -my-1.5 bg-white text-gray-400 hover:text-gray-900 rounded-lg focus:ring-2 focus:ring-gray-300 p-1.5 hover:bg-gray-100 inline-flex items-center justify-center h-8 w-8 dark:text-gray-500 dark:hover:text-white dark:bg-gray-800 dark:hover:bg-gray-700"
      :data-dismiss-target (str "#" id)
      :aria-label          "Close"}
     [:span {:class "sr-only"} "Close"]
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
        :d               "m1 1 6 6m0 0 6 6M7 7l6-6M7 7l-6 6"}]]]]])

(def toast-delay 5000)

(def toast-ids (r/atom 1000000))

(defn toast-id
  [prefix]
  (str prefix "-" (swap! toast-ids inc)))

(defn create-toast
  [description & {:keys [color]
                  :or {color "blue"}}]
  (let [id (toast-id "toast")]
   (swap! toasts conj (standard-toast id description :color color))
   (.setTimeout js/window #(css/fadeout id :fade-time "3s" :callback remove-one-toast) toast-delay)))
