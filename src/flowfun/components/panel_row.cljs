(ns flowfun.components.panel-row)

(defn row-n
  [n & components]
  (let [classes (if (< n 2)
                  "grid gap-4 mb-4"
                  (str "grid gap-4 mb-4 grid-cols-"n))]
    (into [:div
           {:class classes}]
          components)))

