(ns exercises.exploring-functions.phone-number-sanitization-test
  (:require
   [clojure.test :refer [deftest is]]
   [exercises.exploring-functions.phone-number-sanitization :as subject]))

(deftest sanitaze-test
  (is (= "6139950253" (subject/sanitize "+1 (613)-995-0253")))
  
  (is (= "6139950253" (subject/sanitize "613-995-0253")))

  (is (= "6139950253" (subject/sanitize "1 613 995 0253")))

  (is (= "6139950253" (subject/sanitize "613.995.0253"))))
