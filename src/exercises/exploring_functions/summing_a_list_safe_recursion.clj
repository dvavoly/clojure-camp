(ns exercises.exploring-functions.summing-a-list-safe-recursion)

;; Write a function to sum a list of numbers.
;; Use recursion, but in a way that doesn't blow the stack.

(defn sum [values]
  (let [sum-helper (fn [accumulator list]
                     (if (empty? list)
                       accumulator
                       (recur (+ accumulator (first list)) (rest list))))]
    (sum-helper 0 values)))

