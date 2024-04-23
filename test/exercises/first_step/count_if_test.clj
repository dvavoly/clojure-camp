(ns exercises.first-step.count-if-test
  (:require [clojure.test :refer [deftest is testing]]
            [exercises.first-step.count-if :as sut]))

(deftest count-if-test
  (testing "Context of the test assertions"
    (is (= 3 (sut/count-if even? [1 2 3 4 5 6])))

    (is (= 1 (sut/count-if keyword? ["foo" :bar (quote baz)])))

    (is (= 2
           (sut/count-if (fn [x]
                           (= x (reverse x)))
                         [[1 2 1] [1 2 3 4] [1]])))))
