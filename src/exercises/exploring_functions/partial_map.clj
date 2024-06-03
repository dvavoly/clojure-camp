(ns exercises.exploring-functions.partial-map)

;; Write a function that takes two functions and a list.

;; Transform the given list by applying the first function to all the values
;; in the list that return true for the second function;
;; other values should remain as is.

(defn partial-map
  [f pred? values]
  (map (fn [x]
         (if (pred? x)
           (f x)
           x)) values))