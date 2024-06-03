(ns exercises.exploring-functions.map-indexed)

;; Given a list, repeat each element in the list multiple times
;; (the number of times being equal to the item's position in the list).

(defn increasing-repeat [coll]
  (flatten (map-indexed (fn [index element]
                          (repeat (inc index) element))
                        coll)))