(ns flowfun.pages.widgets
  (:require [flowfun.components.dummy :as dummy]
            [flowfun.layout.panel-row :as panel-row]))

(defn widget-list
  []
  [:div
   {:class "items-center rounded bg-gray-50 dark:bg-gray-700 text-gray-400 dark:text-gray-500"}
   [:div.relative.overflow-x-auto.shadow-md.sm:rounded-lg
    [:table.w-full.text-sm.text-left.rtl:text-right.text-gray-500.dark:text-gray-400
     [:thead.text-xs.text-gray-700.uppercase.bg-gray-50.dark:bg-gray-700.dark:text-gray-400
      [:tr
       [:th.p-4 {:scope "col"}
        [:div.flex.items-center
         [:input#checkbox-all-search.w-4.h-4.text-blue-600.bg-gray-100.border-gray-300.rounded.focus:ring-blue-500.dark:focus:ring-blue-600.dark:ring-offset-gray-800.dark:focus:ring-offset-gray-800.focus:ring-2.dark:bg-gray-700.dark:border-gray-600 {:type "checkbox"}]
         [:label.sr-only {:for "checkbox-all-search"} "checkbox"]]]
       [:th.px-6.py-3 {:scope "col"} "Product name"]
       [:th.px-6.py-3 {:scope "col"} "Color"]
       [:th.px-6.py-3 {:scope "col"} "Category"]
       [:th.px-6.py-3 {:scope "col"} "Price"]
       [:th.px-6.py-3 {:scope "col"} "Action"]]]
     [:tbody
      [:tr.bg-white.border-b.dark:bg-gray-800.dark:border-gray-700.hover:bg-gray-50.dark:hover:bg-gray-600
       [:td.w-4.p-4
        [:div.flex.items-center
         [:input#checkbox-table-search-1.w-4.h-4.text-blue-600.bg-gray-100.border-gray-300.rounded.focus:ring-blue-500.dark:focus:ring-blue-600.dark:ring-offset-gray-800.dark:focus:ring-offset-gray-800.focus:ring-2.dark:bg-gray-700.dark:border-gray-600 {:type "checkbox"}]
         [:label.sr-only {:for "checkbox-table-search-1"} "checkbox"]]]
       [:th.px-6.py-4.font-medium.text-gray-900.whitespace-nowrap.dark:text-white {:scope "row"} "Apple MacBook Pro 17\""]
       [:td.px-6.py-4 "Silver"]
       [:td.px-6.py-4 "Laptop"]
       [:td.px-6.py-4 "$2999"]
       [:td.px-6.py-4
        [:a.font-medium.text-blue-600.dark:text-blue-500.hover:underline {:href "#"} "Edit"]]]
      [:tr.bg-white.border-b.dark:bg-gray-800.dark:border-gray-700.hover:bg-gray-50.dark:hover:bg-gray-600
       [:td.w-4.p-4
        [:div.flex.items-center
         [:input#checkbox-table-search-2.w-4.h-4.text-blue-600.bg-gray-100.border-gray-300.rounded.focus:ring-blue-500.dark:focus:ring-blue-600.dark:ring-offset-gray-800.dark:focus:ring-offset-gray-800.focus:ring-2.dark:bg-gray-700.dark:border-gray-600 {:type "checkbox"}]
         [:label.sr-only {:for "checkbox-table-search-2"} "checkbox"]]]
       [:th.px-6.py-4.font-medium.text-gray-900.whitespace-nowrap.dark:text-white {:scope "row"} "Microsoft Surface Pro"]
       [:td.px-6.py-4 "White"]
       [:td.px-6.py-4 "Laptop PC"]
       [:td.px-6.py-4 "$1999"]
       [:td.px-6.py-4
        [:a.font-medium.text-blue-600.dark:text-blue-500.hover:underline {:href "#"} "Edit"]]]
      [:tr.bg-white.border-b.dark:bg-gray-800.dark:border-gray-700.hover:bg-gray-50.dark:hover:bg-gray-600
       [:td.w-4.p-4
        [:div.flex.items-center
         [:input#checkbox-table-search-3.w-4.h-4.text-blue-600.bg-gray-100.border-gray-300.rounded.focus:ring-blue-500.dark:focus:ring-blue-600.dark:ring-offset-gray-800.dark:focus:ring-offset-gray-800.focus:ring-2.dark:bg-gray-700.dark:border-gray-600 {:type "checkbox"}]
         [:label.sr-only {:for "checkbox-table-search-3"} "checkbox"]]]
       [:th.px-6.py-4.font-medium.text-gray-900.whitespace-nowrap.dark:text-white {:scope "row"} "Magic Mouse 2"]
       [:td.px-6.py-4 "Black"]
       [:td.px-6.py-4 "Accessories"]
       [:td.px-6.py-4 "$99"]
       [:td.px-6.py-4
        [:a.font-medium.text-blue-600.dark:text-blue-500.hover:underline {:href "#"} "Edit"]]]
      [:tr.bg-white.border-b.dark:bg-gray-800.dark:border-gray-700.hover:bg-gray-50.dark:hover:bg-gray-600
       [:td.w-4.p-4
        [:div.flex.items-center
         [:input#checkbox-table-search-3.w-4.h-4.text-blue-600.bg-gray-100.border-gray-300.rounded.focus:ring-blue-500.dark:focus:ring-blue-600.dark:ring-offset-gray-800.dark:focus:ring-offset-gray-800.focus:ring-2.dark:bg-gray-700.dark:border-gray-600 {:type "checkbox"}]
         [:label.sr-only {:for "checkbox-table-search-3"} "checkbox"]]]
       [:th.px-6.py-4.font-medium.text-gray-900.whitespace-nowrap.dark:text-white {:scope "row"} "Apple Watch"]
       [:td.px-6.py-4 "Black"]
       [:td.px-6.py-4 "Watches"]
       [:td.px-6.py-4 "$199"]
       [:td.px-6.py-4
        [:a.font-medium.text-blue-600.dark:text-blue-500.hover:underline {:href "#"} "Edit"]]]
      [:tr.bg-white.border-b.dark:bg-gray-800.dark:border-gray-700.hover:bg-gray-50.dark:hover:bg-gray-600
       [:td.w-4.p-4
        [:div.flex.items-center
         [:input#checkbox-table-search-3.w-4.h-4.text-blue-600.bg-gray-100.border-gray-300.rounded.focus:ring-blue-500.dark:focus:ring-blue-600.dark:ring-offset-gray-800.dark:focus:ring-offset-gray-800.focus:ring-2.dark:bg-gray-700.dark:border-gray-600 {:type "checkbox"}]
         [:label.sr-only {:for "checkbox-table-search-3"} "checkbox"]]]
       [:th.px-6.py-4.font-medium.text-gray-900.whitespace-nowrap.dark:text-white {:scope "row"} "Apple iMac"]
       [:td.px-6.py-4 "Silver"]
       [:td.px-6.py-4 "PC"]
       [:td.px-6.py-4 "$2999"]
       [:td.px-6.py-4
        [:a.font-medium.text-blue-600.dark:text-blue-500.hover:underline {:href "#"} "Edit"]]]
      [:tr.bg-white.border-b.dark:bg-gray-800.dark:border-gray-700.hover:bg-gray-50.dark:hover:bg-gray-600
       [:td.w-4.p-4
        [:div.flex.items-center
         [:input#checkbox-table-search-3.w-4.h-4.text-blue-600.bg-gray-100.border-gray-300.rounded.focus:ring-blue-500.dark:focus:ring-blue-600.dark:ring-offset-gray-800.dark:focus:ring-offset-gray-800.focus:ring-2.dark:bg-gray-700.dark:border-gray-600 {:type "checkbox"}]
         [:label.sr-only {:for "checkbox-table-search-3"} "checkbox"]]]
       [:th.px-6.py-4.font-medium.text-gray-900.whitespace-nowrap.dark:text-white {:scope "row"} "Apple AirPods"]
       [:td.px-6.py-4 "White"]
       [:td.px-6.py-4 "Accessories"]
       [:td.px-6.py-4 "$399"]
       [:td.px-6.py-4
        [:a.font-medium.text-blue-600.dark:text-blue-500.hover:underline {:href "#"} "Edit"]]]
      [:tr.bg-white.border-b.dark:bg-gray-800.dark:border-gray-700.hover:bg-gray-50.dark:hover:bg-gray-600
       [:td.w-4.p-4
        [:div.flex.items-center
         [:input#checkbox-table-search-3.w-4.h-4.text-blue-600.bg-gray-100.border-gray-300.rounded.focus:ring-blue-500.dark:focus:ring-blue-600.dark:ring-offset-gray-800.dark:focus:ring-offset-gray-800.focus:ring-2.dark:bg-gray-700.dark:border-gray-600 {:type "checkbox"}]
         [:label.sr-only {:for "checkbox-table-search-3"} "checkbox"]]]
       [:th.px-6.py-4.font-medium.text-gray-900.whitespace-nowrap.dark:text-white {:scope "row"} "iPad Pro"]
       [:td.px-6.py-4 "Gold"]
       [:td.px-6.py-4 "Tablet"]
       [:td.px-6.py-4 "$699"]
       [:td.px-6.py-4
        [:a.font-medium.text-blue-600.dark:text-blue-500.hover:underline {:href "#"} "Edit"]]]
      [:tr.bg-white.border-b.dark:bg-gray-800.dark:border-gray-700.hover:bg-gray-50.dark:hover:bg-gray-600
       [:td.w-4.p-4
        [:div.flex.items-center
         [:input#checkbox-table-search-3.w-4.h-4.text-blue-600.bg-gray-100.border-gray-300.rounded.focus:ring-blue-500.dark:focus:ring-blue-600.dark:ring-offset-gray-800.dark:focus:ring-offset-gray-800.focus:ring-2.dark:bg-gray-700.dark:border-gray-600 {:type "checkbox"}]
         [:label.sr-only {:for "checkbox-table-search-3"} "checkbox"]]]
       [:th.px-6.py-4.font-medium.text-gray-900.whitespace-nowrap.dark:text-white {:scope "row"} "Magic Keyboard"]
       [:td.px-6.py-4 "Black"]
       [:td.px-6.py-4 "Accessories"]
       [:td.px-6.py-4 "$99"]
       [:td.px-6.py-4
        [:a.font-medium.text-blue-600.dark:text-blue-500.hover:underline {:href "#"} "Edit"]]]
      [:tr.bg-white.border-b.dark:bg-gray-800.dark:border-gray-700.hover:bg-gray-50.dark:hover:bg-gray-600
       [:td.w-4.p-4
        [:div.flex.items-center
         [:input#checkbox-table-search-3.w-4.h-4.text-blue-600.bg-gray-100.border-gray-300.rounded.focus:ring-blue-500.dark:focus:ring-blue-600.dark:ring-offset-gray-800.dark:focus:ring-offset-gray-800.focus:ring-2.dark:bg-gray-700.dark:border-gray-600 {:type "checkbox"}]
         [:label.sr-only {:for "checkbox-table-search-3"} "checkbox"]]]
       [:th.px-6.py-4.font-medium.text-gray-900.whitespace-nowrap.dark:text-white {:scope "row"} "Smart Folio iPad Air"]
       [:td.px-6.py-4 "Blue"]
       [:td.px-6.py-4 "Accessories"]
       [:td.px-6.py-4 "$79"]
       [:td.px-6.py-4
        [:a.font-medium.text-blue-600.dark:text-blue-500.hover:underline {:href "#"} "Edit"]]]
      [:tr.bg-white.border-b.dark:bg-gray-800.dark:border-gray-700.hover:bg-gray-50.dark:hover:bg-gray-600
       [:td.w-4.p-4
        [:div.flex.items-center
         [:input#checkbox-table-search-3.w-4.h-4.text-blue-600.bg-gray-100.border-gray-300.rounded.focus:ring-blue-500.dark:focus:ring-blue-600.dark:ring-offset-gray-800.dark:focus:ring-offset-gray-800.focus:ring-2.dark:bg-gray-700.dark:border-gray-600 {:type "checkbox"}]
         [:label.sr-only {:for "checkbox-table-search-3"} "checkbox"]]]
       [:th.px-6.py-4.font-medium.text-gray-900.whitespace-nowrap.dark:text-white {:scope "row"} "AirTag"]
       [:td.px-6.py-4 "Silver"]
       [:td.px-6.py-4 "Accessories"]
       [:td.px-6.py-4 "$29"]
       [:td.px-6.py-4
        [:a.font-medium.text-blue-600.dark:text-blue-500.hover:underline {:href "#"} "Edit"]]]]]
    [:nav.flex.items-center.flex-column.flex-wrap.md:flex-row.justify-between.pt-4 {:aria-label "Table navigation"}
     [:span.text-sm.font-normal.text-gray-500.dark:text-gray-400.mb-4.md:mb-0.block.w-full.md:inline.md:w-auto "Showing" [:span.font-semibold.text-gray-900.dark:text-white "1-10"] "of" [:span.font-semibold.text-gray-900.dark:text-white "1000"]]
     [:ul.inline-flex.-space-x-px.rtl:space-x-reverse.text-sm.h-8
      [:li
       [:a.flex.items-center.justify-center.px-3.h-8.ms-0.leading-tight.text-gray-500.bg-white.border.border-gray-300.rounded-s-lg.hover:bg-gray-100.hover:text-gray-700.dark:bg-gray-800.dark:border-gray-700.dark:text-gray-400.dark:hover:bg-gray-700.dark:hover:text-white {:href "#"} "Previous"]]
      [:li
       [:a.flex.items-center.justify-center.px-3.h-8.leading-tight.text-gray-500.bg-white.border.border-gray-300.hover:bg-gray-100.hover:text-gray-700.dark:bg-gray-800.dark:border-gray-700.dark:text-gray-400.dark:hover:bg-gray-700.dark:hover:text-white {:href "#"} "1"]]
      [:li
       [:a.flex.items-center.justify-center.px-3.h-8.leading-tight.text-gray-500.bg-white.border.border-gray-300.hover:bg-gray-100.hover:text-gray-700.dark:bg-gray-800.dark:border-gray-700.dark:text-gray-400.dark:hover:bg-gray-700.dark:hover:text-white {:href "#"} "2"]]
      [:li
       [:a.flex.items-center.justify-center.px-3.h-8.text-blue-600.border.border-gray-300.bg-blue-50.hover:bg-blue-100.hover:text-blue-700.dark:border-gray-700.dark:bg-gray-700.dark:text-white {:href "#" :aria-current "page"} "3"]]
      [:li
       [:a.flex.items-center.justify-center.px-3.h-8.leading-tight.text-gray-500.bg-white.border.border-gray-300.hover:bg-gray-100.hover:text-gray-700.dark:bg-gray-800.dark:border-gray-700.dark:text-gray-400.dark:hover:bg-gray-700.dark:hover:text-white {:href "#"} "4"]]
      [:li
       [:a.flex.items-center.justify-center.px-3.h-8.leading-tight.text-gray-500.bg-white.border.border-gray-300.hover:bg-gray-100.hover:text-gray-700.dark:bg-gray-800.dark:border-gray-700.dark:text-gray-400.dark:hover:bg-gray-700.dark:hover:text-white {:href "#"} "5"]]
      [:li
       [:a.flex.items-center.justify-center.px-3.h-8.leading-tight.text-gray-500.bg-white.border.border-gray-300.rounded-e-lg.hover:bg-gray-100.hover:text-gray-700.dark:bg-gray-800.dark:border-gray-700.dark:text-gray-400.dark:hover:bg-gray-700.dark:hover:text-white {:href "#"} "Next"]]]]]
   ])

(defn widget-page
  []
  [:div
   {:class
    "px-4 pt-4 border-2 border-gray-200 border-dashed rounded-lg dark:border-gray-700 mt-14"}
   [panel-row/row-of-n 1 [widget-list]]])
