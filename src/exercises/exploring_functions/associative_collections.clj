(ns exercises.exploring-functions.associative-collections)

;; Write a function get-and-set that makes a change to a collection at some location,
;; and return the original value at that location and the changed collection.

;; get-and-set should take 3 arguments: a key, a value, and a collection (a vector or map).

;; It should return a vector of two things:
;; (1) the value that was at that key in the original collection, and
;; (2) the updated collection.

(defn get-and-set
  [k v coll]
  (vector
   (get coll k)
   (assoc coll k v)))