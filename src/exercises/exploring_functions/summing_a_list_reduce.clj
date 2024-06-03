(ns exercises.exploring-functions.summing-a-list-reduce)

;; Write a function to sum a list of numbers, using reduce.

(defn sum [values]
  (reduce + values)) 