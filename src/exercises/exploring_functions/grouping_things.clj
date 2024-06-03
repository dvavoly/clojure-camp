(ns exercises.exploring-functions.grouping-things)

;; Given a list of strings, categorize them by the number of characters.

(defn categorise [strings]
  (group-by count strings))