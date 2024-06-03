(ns exercises.exploring-functions.deep-update 
  (:require [clojure.string :as string]))

(comment
;;   Write a function that takes a map with this structure:
  {:people {1 {:name "james"
               :points 1}
            2 {:name "rafd"
               :points 5}}}

;;   as well as an id and a number.

;;   Return the same map but with the person with
;; the given id having their name converted to upper-case and
;; the given number added to their points.
  )

(defn update-info
  [info id points]
  (-> info
      (update-in [:people id :name] string/upper-case)
      (update-in [:people id :points] + points)))

