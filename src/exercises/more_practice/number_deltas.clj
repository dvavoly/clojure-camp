(ns exercises.more-practice.number-deltas)

;; Given a list of numbers, return a list of the differences between the adjacent numbers.

(defn deltas [nums]
  (map (fn [[a b]] (- b a))
       (partition 2 1 nums)))

(comment
  (defn deltas [nums] (map - (rest nums) nums))

  (defn deltas-v2
    [nums]
    (->> nums
         (partition 2 1)
         (map (fn [[a b]]
                (- b a))))))

(map + [1 2 3] [3 2 1])