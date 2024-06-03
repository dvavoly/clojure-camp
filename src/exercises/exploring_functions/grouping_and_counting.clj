(ns exercises.exploring-functions.grouping-and-counting)

;; Given a list of string, count how many words have each length

#_(defn count-by-length [strings]
  (->> strings
       (map count)
       (frequencies)))

(defn count-by-length [strings]
  (->> strings
       (group-by count)
       (map (fn [[k v]]
                [k (count v)]))
       (into {})))