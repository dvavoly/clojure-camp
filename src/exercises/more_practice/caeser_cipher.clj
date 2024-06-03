(ns exercises.more-practice.caeser-cipher)

;; Write a function to decode a Caeser Cipher.
;; A Caeser Cipher is a rotation cipher: each letter in some text is shifted in the alphabet by a fixed number.
;; For example, "IBM" and -1 results in "HAL".

;; Create a function caesar-decode that takes a string and a "secret key"
;; which is a number that indicates how many characters to rotate the letters by.

;; You can assume that only upper-case letters will be used, leave spaces unchanged.

(defn encrypt-char [ch key]
  (if (Character/isWhitespace ch)
    ch
    (char (+ (int \A) (mod (+ (- (int ch) (int \A)) key) 26)))))

(defn caeser-decode [key message]
  (apply str (map #(encrypt-char % key) message)))
