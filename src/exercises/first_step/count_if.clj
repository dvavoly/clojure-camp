(ns exercises.first-step.count-if)

;; Write a function count-if that counts the number of items in a collection
;; that pass a certain predicate.

(defn count-if
  [pred? coll]
  (->> coll
       (filter pred?)
       count))
