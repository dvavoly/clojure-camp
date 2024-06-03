(ns exercises.more-practice.summing-a-list-naive-recursion)

;; Write a function to sum a list of numbers, using recursion.

(comment
  (defn sum
    [values]
    (if (empty? values)
      0
      (+ (first values) (sum (rest values))))))

(defn sum [values]
  (let [sum-recursive (fn sum-helper [accumulator numbers]
                       (if (empty? numbers)
                         accumulator
                         (sum-helper (+ accumulator (first numbers)) (rest numbers))))]
    (sum-recursive 0 values)))