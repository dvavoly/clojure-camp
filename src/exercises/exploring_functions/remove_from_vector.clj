(ns exercises.exploring-functions.remove-from-vector)

;; Write a function that removes a value at a given index from a vector,
;; moving everything else up.

(defn dissoc-at [v index]
  (into (subvec v 0 index)
        (subvec v (inc index))))