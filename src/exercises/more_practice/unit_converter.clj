(ns exercises.more-practice.unit-converter)

;; Write a function that can convert between many different types of units.

(defn c-to-f [c]
  (+ (* 1.8 c) 32))
(defn f-to-c [f]
  (/ (- f 32) 1.8))

(def lookup {[:lb :kg] 0.453592
             [:kg :lb] 2.20462
             [:meters :feet] 3.28084
             [:feet :meters] 0.3048
             [:meters :inches] 39.3701
             [:inches :meters] 0.0254
             [:fahrenheit :celsius] f-to-c
             [:celsius :fahrenheit] c-to-f})

(defn convert [num from-unit to-unit]
  (Math/round (* num (get lookup [from-unit to-unit]))))


(def p {:name "James" :age 11})
(update p :age1 + 1)

(def empty-map {\C 3})

(update empty-map \C (fn [x]
                       (if (= x nil)
                         1
                         (inc x))))
(def test-string "This is a test string!")
(map (fn [ch]) test-string)
(->> test-string
     (frequencies)
     (sort-by (juxt key val))
     (reverse)
     (take 5)
     (into {}))

(comment
  (def conv-fn
    {:kg         {:lb (fn [k] (* k 2.2))}
     :lb         {:kg (fn [l] (/ l 2.2))}
     :celsius    {:fahrenheit (fn [c] (+ (* 1.8 c) 32))}
     :fahrenheit {:celsius (fn [f] (/ (- f 32) 1.8))}
     :meters     {:feet   (fn [m] (* 3.28 m))
                  :inches (fn [m] (* 12 3.28 m))}
     :feet       {:meters (fn [f] (/ 3.28 f))
                  :inches (fn [f] (* 12 f))}})

  (defn convert
    [num from-unit to-unit]
    (-> ((get-in conv-fn [from-unit to-unit]) num)
        (Math/round)))
  )