(ns exercises.first-step.clamp)

;; Write a function clamp to restrict a value to a given range.

(defn clamp [x min max]
  (cond
    (< x min) min
    (> x max) max
    :else x))