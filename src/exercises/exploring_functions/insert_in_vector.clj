(ns exercises.exploring-functions.insert-in-vector)

;; Write a function that inserts a value into a vector at a given index
;; (moving all subsequent values).

(defn insert-at [v index value]
  (into (conj (subvec v 0 index) value)
        (subvec v index)))