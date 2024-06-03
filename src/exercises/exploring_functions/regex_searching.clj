(ns exercises.exploring-functions.regex-searching)

;; Given a string of text, find all the substrings inside of it that are phone numbers.

(defn find-phone-numbers [text]
  (re-seq #"(?:\+?\d[- ])?(?:\(\d{3}\)|\d{3})[- ]\d{3}[- ]\d{4}" text))