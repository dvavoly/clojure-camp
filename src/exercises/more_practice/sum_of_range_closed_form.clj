(ns exercises.more-practice.sum-of-range-closed-form)

;; Write a function that, given a number N, returns the sum of numbers from 1 to N, inclusive.
;; Note, this can be done with a formula: https://en.wikipedia.org/wiki/Arithmetic_progression

(defn sum-to [n]
  (-> n
      (+ 1)
      (* n)
      (/ 2)))

#_(sum-to 5)