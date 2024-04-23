(ns exercises.first-step.threadin-macro)

;; Refactor the below functions to use the "threading macros" -> and ->>
(defn process-number [n] (* (+ (inc (/ n 1.5)) 2) 10))

(defn process-list
  [coll]
  (map (fn [x]
         (* x 10))
       (filter even? (map inc coll))))

(defn process-number-ref
  [n]
  (-> n
      (/ 1.5)
      inc
      (+ 2)
      (* 10)))

(defn process-list-ref
  [coll]
  (->> coll
       (map inc)
       (filter even?)
       (map (fn [x]
              (* x 10)))))