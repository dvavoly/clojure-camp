(ns exercises.first-step.refactor-ifs-test
  (:require [clojure.test :as t]
            [exercises.first-step.refactor-ifs :as sut]))

(t/deftest process-value-test
  (t/testing "Something case"
    (t/is (= :something-else (sut/process-value ["vecrtor" "with" "string" "elements"]))))
  (t/testing "Zero case"
    (t/is (= :zero (sut/process-value 0))))
  (t/testing "String case"
    (t/is (= :a-string (sut/process-value "String"))))
  (t/testing "Negative case"
    (t/is (= :negative (sut/process-value -1))))
  (t/testing "Big number case"
    (t/is (= :pretty-big (sut/process-value 15))))
  (t/testing "Nil case"
    (t/is (= :something-else (sut/process-value nil))))
  (t/testing "Small number case"
    (t/is (= :small-number (sut/process-value 5)))))
