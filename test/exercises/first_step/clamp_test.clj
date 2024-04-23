(ns exercises.first-step.clamp-test
  (:require [clojure.test :refer [deftest is testing]]
            [exercises.first-step.clamp :as sut]))

(deftest clamp-test
  (testing "Context of the test assertions"
    (is (= 2 (sut/clamp 2 1 4)))

    (is (= 1 (sut/clamp 0 1 4)))

    (is (= 4 (sut/clamp 5 1 4)))))
 