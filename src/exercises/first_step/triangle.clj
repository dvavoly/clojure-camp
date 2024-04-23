(ns exercises.first-step.triangle)

;; Write a function to determine
;; if some 3 side lengths are sufficient to make a triangle.
;; 
;; To check if 3 sides make a triangle, you need to check
;; that every side is less than or equal to the sum of the other two sides.

(defn triangle? [a b c]
  (and (<= a (+ b c))
       (<= b (+ a c))
       (<= c (+ a b))))