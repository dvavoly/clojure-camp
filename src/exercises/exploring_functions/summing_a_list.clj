(ns exercises.exploring-functions.summing-a-list)

;; Write a function to sum a list of numbers, using apply.

(defn sum [values]
  (apply + values))