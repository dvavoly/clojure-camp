(ns exercises.first-step.find-largest)

;; Write a function largest to find the largest number in a list,
;; making use of max and either apply or reduce.

;; Note that max takes a variable number of arguments,
;; but does not work with arrays, ie. (max 1 2 3) works as expected,
;; but (max [1 2 3]) does not.

(defn largest [nums]
  (reduce max nums))

(defn largest-apply [nums]
  (apply max nums))