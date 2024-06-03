(ns exercises.exploring-functions.map-transforms)

(comment
;;   Write a function that takes a map with the below format:

  {:disabled? true
   :name      "james"
   :points    0}

;; and returns a map with the :disabled? key removed,
;; 1 added to the :points value,
;; add a key called :activated added with the value "now";

;; all other keys should be left as-is.
  )

(defn activate [person]
  (-> person
      (assoc :activated "now")
      (update :points inc)
      (dissoc :disabled?)))