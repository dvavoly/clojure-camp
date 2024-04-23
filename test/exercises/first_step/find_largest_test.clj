(ns exercises.first-step.find-largest-test
  (:require [clojure.test :refer [deftest is testing]]
            [exercises.first-step.find-largest :as sut]))

(deftest largest-test
  (testing "Context of the test assertions"
    (is (= 3 (sut/largest [1 2 -1 3 3 2 1 0])))
    (is (= 3 (sut/largest-apply [1 2 -1 3 3 2 1 0])))))