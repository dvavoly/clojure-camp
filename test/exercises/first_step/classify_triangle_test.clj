(ns exercises.first-step.classify-triangle-test
  (:require [clojure.test :refer [deftest is testing]]
            [exercises.first-step.classify-triangle :as sut]))

(deftest classify-triangle-test
  (testing "Context of the test assertions"
    (is (= :equilateral (sut/classify-triangle 1 1 1)))

    (is (= :invalid (sut/classify-triangle 0 0 0)))

    (is (= :invalid (sut/classify-triangle 1 1 2)))

    (is (= :isosceles (sut/classify-triangle 4 4 5)))

    (is (= :scalene (sut/classify-triangle 3 4 5)))))
