(ns flowfun.layout.nav
  (:require [flowfun.utilities.dark :as dark]))

(defn component
  []
  [:nav
  {:class
   "fixed top-0 z-50 w-full bg-white border-b border-gray-200 dark:bg-gray-800 dark:border-gray-700"}
  [:div
   {:class "px-3 py-3 lg:px-5 lg:pl-3"}
   [:div
    {:class "flex items-center justify-between"}
    [:div
     {:class "flex items-center justify-start rtl:justify-end"}
     [:button
      {:data-drawer-target "logo-sidebar",
       :data-drawer-toggle "logo-sidebar",
       :aria-controls "logo-sidebar",
       :type "button",
       :class
       "inline-flex items-center p-2 text-sm text-gray-500 rounded-lg sm:hidden hover:bg-gray-100 focus:outline-none focus:ring-2 focus:ring-gray-200 dark:text-gray-400 dark:hover:bg-gray-700 dark:focus:ring-gray-600"}
      [:span {:class "sr-only"} "Open sidebar"]
      [:svg
       {:class "w-6 h-6",
        :aria-hidden "true",
        :fill "currentColor",
        :viewBox "0 0 20 20",
        :xmlns "http://www.w3.org/2000/svg"}
       [:path
        {:clip-rule "evenodd",
         :fill-rule "evenodd",
         :d
         "M2 4.75A.75.75 0 012.75 4h14.5a.75.75 0 010 1.5H2.75A.75.75 0 012 4.75zm0 10.5a.75.75 0 01.75-.75h7.5a.75.75 0 010 1.5h-7.5a.75.75 0 01-.75-.75zM2 10a.75.75 0 01.75-.75h14.5a.75.75 0 010 1.5H2.75A.75.75 0 012 10z"}]]]
     [:a
      {:href "https://github.com/hayzee/flowfun", :class "flex ms-2 md:me-24"}
      [:img
       {:src "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c5/Mega_Brands_logo.png/800px-Mega_Brands_logo.png",
          :class "h-8 me-3 mb-3",
        :alt "Petersoft Logo"}]
      [:span
       {:class
        "self-center text-xl font-semibold sm:text-2xl whitespace-nowrap dark:text-white"}
       "CRM"]]]

    #_[:div
     {:class "flex items-center"}
     [:span
      {:class
       "self-center text-xl font-semibold sm:text-2xl whitespace-nowrap dark:text-white"}
      "Super App."]
     ]

    [:div
     {:class "flex items-center"}

     [:div
      {:class "flex items-center ms-3"}


      [:div
       {:class "flex md:order-2"}
       [:button
        {:type "button",
         :data-collapse-toggle "navbar-search",
         :aria-controls "navbar-search",
         :aria-expanded "false",
         :class
         "md:hidden text-gray-500 dark:text-gray-400 hover:bg-gray-100 dark:hover:bg-gray-700 focus:outline-none focus:ring-4 focus:ring-gray-200 dark:focus:ring-gray-700 rounded-lg text-sm p-2.5 me-1"}
        [:svg
         {:class "w-5 h-5",
          :aria-hidden "true",
          :xmlns "http://www.w3.org/2000/svg",
          :fill "none",
          :viewBox "0 0 20 20"}
         [:path
          {:stroke "currentColor",
           :stroke-linecap "round",
           :stroke-linejoin "round",
           :stroke-width "2",
           :d "m19 19-4-4m0-7A7 7 0 1 1 1 8a7 7 0 0 1 14 0Z"}]]
        [:span {:class "sr-only"} "Search"]]
       [:div
        {:class "relative hidden md:block"}
        [:div
         {:class
          "absolute inset-y-0 start-0 flex items-center ps-3 pointer-events-none"}
         [:svg
          {:class "w-4 h-4 text-gray-500 dark:text-gray-400",
           :aria-hidden "true",
           :xmlns "http://www.w3.org/2000/svg",
           :fill "none",
           :viewBox "0 0 20 20"}
          [:path
           {:stroke "currentColor",
            :stroke-linecap "round",
            :stroke-linejoin "round",
            :stroke-width "2",
            :d "m19 19-4-4m0-7A7 7 0 1 1 1 8a7 7 0 0 1 14 0Z"}]]
         [:span {:class "sr-only"} "Search icon"]]
        [:input
         {:type "text",
          :id "navbar-search",
          :class
          "block w-full p-2 ps-10 text-sm text-gray-900 border border-gray-300 rounded-lg bg-gray-50 focus:ring-blue-500 focus:border-blue-500 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500",
          :placeholder "Search..."}]]
       [:button
        {:data-collapse-toggle "navbar-search",
         :type "button",
         :class
         "inline-flex items-center p-2 w-10 h-10 justify-center text-sm text-gray-500 rounded-lg md:hidden hover:bg-gray-100 focus:outline-none focus:ring-2 focus:ring-gray-200 dark:text-gray-400 dark:hover:bg-gray-700 dark:focus:ring-gray-600",
         :aria-controls "navbar-search",
         :aria-expanded "false"}
        [:span {:class "sr-only"} "Open main menu"]
        [:svg
         {:class "w-5 h-5",
          :aria-hidden "true",
          :xmlns "http://www.w3.org/2000/svg",
          :fill "none",
          :viewBox "0 0 17 14"}
         [:path
          {:stroke "currentColor",
           :stroke-linecap "round",
           :stroke-linejoin "round",
           :stroke-width "2",
           :d "M1 1h15M1 7h15M1 13h15"}]]]]
      ]

     [:div
      {:class "flex items-center ms-3"}
      [:div
       [:button
        {:id "theme-toggle",
         :type "button",
         :class
         "text-gray-500 dark:text-gray-400 hover:bg-gray-100 dark:hover:bg-gray-700 focus:outline-none focus:ring-4 focus:ring-gray-200 dark:focus:ring-gray-700 rounded-lg text-sm p-2.5"
         :on-click dark/toggle-dark}
        [:svg
         {:id "theme-toggle-dark-icon",
          :class "hidden w-5 h-5",
          :fill "currentColor",
          :viewBox "0 0 20 20",
          :xmlns "http://www.w3.org/2000/svg"}
         [:path
          {:d
           "M17.293 13.293A8 8 0 016.707 2.707a8.001 8.001 0 1010.586 10.586z"}]]
        [:svg
         {:id "theme-toggle-light-icon",
          :class "w-5 h-5",
          :fill "currentColor",
          :viewBox "0 0 20 20",
          :xmlns "http://www.w3.org/2000/svg"}
         [:path
          {:d
           "M10 2a1 1 0 011 1v1a1 1 0 11-2 0V3a1 1 0 011-1zm4 8a4 4 0 11-8 0 4 4 0 018 0zm-.464 4.95l.707.707a1 1 0 001.414-1.414l-.707-.707a1 1 0 00-1.414 1.414zm2.12-10.607a1 1 0 010 1.414l-.706.707a1 1 0 11-1.414-1.414l.707-.707a1 1 0 011.414 0zM17 11a1 1 0 100-2h-1a1 1 0 100 2h1zm-7 4a1 1 0 011 1v1a1 1 0 11-2 0v-1a1 1 0 011-1zM5.05 6.464A1 1 0 106.465 5.05l-.708-.707a1 1 0 00-1.414 1.414l.707.707zm1.414 8.486l-.707.707a1 1 0 01-1.414-1.414l.707-.707a1 1 0 011.414 1.414zM4 11a1 1 0 100-2H3a1 1 0 000 2h1z",
           :fill-rule "evenodd",
           :clip-rule "evenodd"}]]]]]
     [:div
      {:class "flex items-center ms-3"}
      [:div
       [:button
        {:type "button",
         :class
         "flex text-sm bg-gray-800 rounded-full focus:ring-4 focus:ring-gray-300 dark:focus:ring-gray-600",
         :aria-expanded "false",
         :data-dropdown-toggle "dropdown-user"}
        [:span {:class "sr-only"} "Open user menu"]
        [:img
         {:class "w-8 h-8 rounded-full",
          :src
          "https://avatars.githubusercontent.com/u/22116887?v=4"
          :alt "user photo"}]]]
      [:div
       {:class
        "z-50 hidden my-4 text-base list-none bg-white divide-y divide-gray-100 rounded shadow dark:bg-gray-700 dark:divide-gray-600",
        :id "dropdown-user"}
       [:div
        {:class "px-4 py-3", :role "none"}
        [:p
         {:class "text-sm text-gray-900 dark:text-white", :role "none"}
         "Bob Smith"]
        [:p
         {:class
          "text-sm font-medium text-gray-900 truncate dark:text-gray-300",
          :role "none"}
         "bob.smith@petersoft.com"]]
       [:ul
        {:class "py-1", :role "none"}
        [:li
         [:a
          {:href "#",
           :class
           "block px-4 py-2 text-sm text-gray-700 hover:bg-gray-100 dark:text-gray-300 dark:hover:bg-gray-600 dark:hover:text-white",
           :role "menuitem"}
          "Dashboard"]]
        [:li
         [:a
          {:href "#",
           :class
           "block px-4 py-2 text-sm text-gray-700 hover:bg-gray-100 dark:text-gray-300 dark:hover:bg-gray-600 dark:hover:text-white",
           :role "menuitem"}
          "Settings"]]
        [:li
         [:a
          {:href "#",
           :class
           "block px-4 py-2 text-sm text-gray-700 hover:bg-gray-100 dark:text-gray-300 dark:hover:bg-gray-600 dark:hover:text-white",
           :role "menuitem"}
          "Earnings"]]
        [:li
         [:a
          {:href "#",
           :class
           "block px-4 py-2 text-sm text-gray-700 hover:bg-gray-100 dark:text-gray-300 dark:hover:bg-gray-600 dark:hover:text-white",
           :role "menuitem"}
          "Sign out"]]]]]
     ]]]])
