(ns exercises.more-practice.dot-products)

;; Write a function to compute the dot product of two vectors.

(defn dot [v1 v2]
  (->>
   (map (fn ([a1 a2] (* a1 a2))) v1 v2)
   (reduce + )))

#_(dot [1 2 3] [4 5 6])

(defn dot-2
  [v1 v2]
  (->>
   (map * v1 v2)
   (reduce +)))

#_(dot-2 [1 2 3] [4 5 6])