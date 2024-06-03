(ns exercises.more-practice.fizzbuzz)

;; Implement fizzbuzz, which prints the numbers from 1 to 100,
;; replacing multiples of 3 with "fizz",
;; multiples of 5 with "buzz" and multiples of 3 and 5 with "fizzbuzz".

(defn div? [n factor] (= 0 (mod n factor)))

(defn fizz-buzz-maper
  [num]
  (cond
    (div? num (* 3 5)) "fizzbuzz"
    (div? num 3) "fizz"
    (div? num 5) "buzz"
    :else num))

(defn fizzbuzz []
  (mapv fizz-buzz-maper (range 1 101)))

#_(defn fizzbuzz
  []
  (doseq [n (range 1 101)]
    (println (cond (div? n (* 3 5)) "fizzbuzz"
                   (div? n 3) "fizz"
                   (div? n 5) "buzz"
                   :else n))))
