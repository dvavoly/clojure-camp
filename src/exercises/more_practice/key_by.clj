(ns exercises.more-practice.key-by)

;; Implement _key-by_, a function that given a list of items, converts it to a map,
;; with each item keyed by a given function

;; reduce assoc

(defn key-by [f values]
  (reduce (fn [acc value]
            (assoc acc (f value) value))
          {} values))

#_(key-by hash ["Alice" "Bob"])
#_(key-by :id
          [{:name "Alice"
            :id   123}
           {:name "Bob"
            :id   456}])
