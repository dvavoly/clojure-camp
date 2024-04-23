(ns exercises.first-step.threadin-macro-test
  (:require [clojure.test :refer [deftest is testing]]
            [exercises.first-step.threadin-macro :as sut]))

(def number-test 4)
(def collection-test [1 2 3 4 5])

(deftest process-number-test
  (testing "Check if two functions are equal"
    (is (= (sut/process-number number-test)
           (sut/process-number-ref number-test)))))

(deftest process-list-test
  (testing "Check if two functions are equal"
    (is (= (sut/process-list collection-test)
           (sut/process-list-ref collection-test)))))
