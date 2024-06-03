(ns exercises.more-practice.2d-transpose)

;; Write a function that takes a matrix as a vector of vectors and inverts it.

(defn transpose [matrix]
  (apply mapv vector matrix))

#_(transpose [[1 4] [2 5] [3 6]])
