(ns exercises.exploring-functions.merging-maps)

;; Write a function that takes two lists of maps and combines the corresponding pairs.

(defn join-maps [coll1 coll2]
  (map merge coll1 coll2))