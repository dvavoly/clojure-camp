(ns exercises.more-practice.sum-of-range)

;; Write a function that, given a number N, returns the sum of numbers from 1 to N, inclusive.
;; Use sequences

(defn sum-to [n]
  (->> n
       inc
       (range 1)
       (apply +)))

#_(sum-to 5)