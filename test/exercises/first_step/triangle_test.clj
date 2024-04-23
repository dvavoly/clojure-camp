(ns exercises.first-step.triangle-test
  (:require [clojure.test :refer [deftest is testing]]
            [exercises.first-step.triangle :refer [triangle?]]))

(deftest name-test
  (testing "Varios tests for check if we can create triangle"
    (is (= true (triangle? 3 4 5)))
    (is (= true (triangle? 1 1 2)))
    (is (= false (triangle? 3 1 1)))
    (is (= false (triangle? 1 1 5)))))
