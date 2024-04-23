(ns exercises.first-step.classify-triangle)

;; Write a function classify-triangle, which, given 3 numbers,
;; returns whether a triangle is equilateral (3 equal sides),
;; isosceles (2 equal sides), scalene, or, not a triangle.

(defn trirangle? [a b c]
  (and (< a (+ b c)) (< b (+ a c)) (< c (+ a b))))

(defn classify-triangle [a b c]
  (cond
    (not (trirangle? a b c)) :invalid
    (= a b c) :equilateral
    (or (= a b) (= b c) (= a c)) :isosceles
    :else :scalene))

#_(defn classify-triangle [a b c]
    (cond
      (= 0 a b c) :invalid
      (or (= a (+ b c))
          (= b (+ a c))
          (= c (+ a b))) :invalid
      (= a b c) :equilateral
      (or (= a b) (= b c) (= a c)) :isosceles
      :else :scalene))
