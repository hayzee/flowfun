(ns flowfun.pages.toastie
  (:require [flowfun.layout.panel-row :as panel-row]
            [flowfun.components.toast.core :as toast]))

(defn bunch-o-toasts
  []
  [:div
   {:class    "flex items-center p-4 h-36 rounded bg-gray-50 dark:bg-gray-700"
    ;:on-click #(swap! n inc)
    }

   [:p
    {:class "text-2xl text-gray-400 dark:text-gray-500"}
    [:<>
     [:button
      {:type "button",
       :class
       "text-white bg-blue-700 hover:bg-blue-800 focus:ring-4 focus:ring-blue-300 font-medium rounded-lg text-sm px-5 py-2.5 me-2 mb-2 dark:bg-blue-600 dark:hover:bg-blue-700 focus:outline-none dark:focus:ring-blue-800"
       :on-click #(toast/create-toast "This is some blue toast, it is very blue" :color "blue")}
      "Default"]
     [:button
      {:type "button",
       :class
       "focus:outline-none text-white bg-green-700 hover:bg-green-800 focus:ring-4 focus:ring-green-300 font-medium rounded-lg text-sm px-5 py-2.5 me-2 mb-2 dark:bg-green-600 dark:hover:bg-green-700 dark:focus:ring-green-800"
       :on-click #(toast/create-toast "This is some green toast, it is very green" :color "green")
       }
      "Green"]
     [:button
      {:type "button",
       :class
       "focus:outline-none text-white bg-red-700 hover:bg-red-800 focus:ring-4 focus:ring-red-300 font-medium rounded-lg text-sm px-5 py-2.5 me-2 mb-2 dark:bg-red-600 dark:hover:bg-red-700 dark:focus:ring-red-900"
       :on-click #(toast/create-toast "This is some red toast, it is very red" :color "red")
       }
      "Red"]
     [:button
      {:type "button",
       :class
       "focus:outline-none text-white bg-yellow-400 hover:bg-yellow-500 focus:ring-4 focus:ring-yellow-300 font-medium rounded-lg text-sm px-5 py-2.5 me-2 mb-2 dark:focus:ring-yellow-900"
       :on-click #(toast/create-toast "This is some yellow toast, it is very yellow" :color "yellow")
       }
      "Yellow"]
     [:button
      {:type "button",
       :class
       "focus:outline-none text-white bg-purple-700 hover:bg-purple-800 focus:ring-4 focus:ring-purple-300 font-medium rounded-lg text-sm px-5 py-2.5 me-2 mb-2 dark:bg-purple-600 dark:hover:bg-purple-700 dark:focus:ring-purple-900"
       :on-click #(toast/create-toast "This is some purple toast, it is very purple" :color "purple")
       }
      "Purple"]
     [:button
      {:type "button",
       :class
       "focus:outline-none text-white bg-gray-700 hover:bg-gray-800 focus:ring-4 focus:ring-gray-300 font-medium rounded-lg text-sm px-5 py-2.5 me-2 mb-2 dark:bg-gray-600 dark:hover:bg-gray-800 dark:focus:ring-gray-500"
       :on-click #(toast/create-toast "This is some purple toast, it is very purple" :color "gray")
       }
      "Gray"]
     [:button
      {:type "button",
       :class
       "focus:outline-none text-white bg-indigo-700 hover:bg-indigo-800 focus:ring-4 focus:ring-indigo-300 font-medium rounded-lg text-sm px-5 py-2.5 me-2 mb-2 dark:bg-indigo-600 dark:hover:bg-indigo-700 dark:focus:ring-indigo-900"
       :on-click #(toast/create-toast "This is some indigo toast, it is very indigo" :color "indigo")
       }
      "Indigo"]
     [:button
      {:type "button",
       :class
       "focus:outline-none text-white bg-pink-700 hover:bg-pink-800 focus:ring-4 focus:ring-pink-300 font-medium rounded-lg text-sm px-5 py-2.5 me-2 mb-2 dark:bg-pink-600 dark:hover:bg-pink-700 dark:focus:ring-pink-900"
       :on-click #(toast/create-toast "This is some pink toast, it is very pink" :color "pink")
       }
      "Pink"]
     ]
    ]])

(defn toastie-page
  []
  [:div
   {:class
    "px-4 pt-4 border-2 border-gray-200 border-dashed rounded-lg dark:border-gray-700 mt-14"}
   [:h1 {:class "mb-4 text-2xl font-medium tracking-tight leading-none text-gray-900 md:text-3xl lg:text-4xl dark:text-white"} "Select your toast"]
   [panel-row/row-of-n 1 [bunch-o-toasts]]])
