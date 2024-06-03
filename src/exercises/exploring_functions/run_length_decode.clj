(ns exercises.exploring-functions.run-length-decode)

;; Run-length-encoding is a form of lossless data compression.
;; For example, the array [:a :a :b :b :b :c :a :a :d :d]
;; could be represented as: [[:a 2] [:b 3] [:c 1] [:a 2] [:d 2]].

;; Write a function to decode a run-length encoded list.

(defn run-length-decode [runs]
  (mapcat (fn [[element times]]
            (repeat times element))
          runs))