(ns exercises.exploring-functions.grouping-things-continued 
  (:require [clojure.string :as s]))

;; Given a list of strings, categorize them by their starting character and
;; within those groupings, categorize them by length.

(defn categorise [strings]
  (->> strings
       (group-by (fn [string]
                   (count (s/split string #" "))))
       (map (fn [[word-count grouped-words]]
              [word-count (group-by count grouped-words)]))
       (into {})))
