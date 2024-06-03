(ns exercises.more-practice.caeser-cipher-test
  (:require
   [clojure.test :refer [deftest is]]
   [exercises.more-practice.caeser-cipher :as subject]))

(deftest caesar-decode-test
  (is (= "KHOOR ZRUOG" (subject/caeser-decode 3 "HELLO WORLD")))

  (is (= "HELLO WORLD" (subject/caeser-decode -3 "KHOOR ZRUOG")))
  
  (is (= "HELLO WORLD" (subject/caeser-decode 13 (subject/caeser-decode 13 "HELLO WORLD")))))