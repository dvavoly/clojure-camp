(ns exercises.exploring-functions.phone-number-sanitization)

;; Implement a function to clean-up phone numbers so that they can be stored in
;; a standardized way: a string of 10 digits.

;; Make use of filter.

(defn sanitize [phone-number]
  (->> phone-number
       (filter #{\0 \1 \2 \3 \4 \5 \6 \7 \8 \9})
    ;;    (filter (fn [x] (Character/isDigit x)))
       (take-last 10)
       (apply str)))
