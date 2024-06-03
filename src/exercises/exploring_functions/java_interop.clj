(ns exercises.exploring-functions.java-interop
  (:import (java.security MessageDigest)
           (java.nio.charset StandardCharsets)))

;; Use the java.security.MessageDigest class from the Java standard library to write a function that generates the hex-encoded SHA-256 hash of an input string.

;; In Java, you would do:
;; String s = "Some Text"
;; MessageDigest md = MessageDigest.getInstance("SHA-256")
;; md.update(s.getBytes("UTF-8"))
;; byte[] dig = md.digest()

;; You can convert a byte to its character in Clojure using (format "%02x" the-byte)

(defn sha256 [s]
  (let [digest (MessageDigest/getInstance "SHA-256")
        hash-bytes (.digest digest (.getBytes s StandardCharsets/UTF_8))]
    (->> hash-bytes
         (map (fn [byte]
                (format "%02x" byte)))
         (apply str))))
  
(comment
  (import '(java.security MessageDigest))

  (defn sha256
    [s]
    (-> (doto (MessageDigest/getInstance "SHA-256")
          (.update (.getBytes s "UTF-8")))
        (.digest)
        (->> (map (fn [b]
                    (format "%02x" b)))
             (apply str))))
  )