(ns exercises.exploring-functions.the-almighty-reduce)

(comment
;; Refactor the following code to use a single reduce instead of a map and filter:
  (defn long-lengths
    [strings]
    (map count
         (filter (fn [string]
                   (< 5 (count string)))
                 strings))))

(defn long-lengths
  [strings]
  (reduce (fn [counts string]
            (let [length (count string)]
              (if (< 5 length)
                (conj counts length)
                counts)))
          [] strings))

#_(long-lengths ["foo" "aoeusnth" "q" "aoeus" "abcdef" "1234567"])
