(ns exercises.exploring-functions.grouping-and-counting-test
  (:require [clojure.test :refer [deftest is testing]]
            [exercises.exploring-functions.grouping-and-counting :as sut]))

(deftest groping-and-conunting-test
  (testing "Context of the test assertions"
    (is (= {7 1
            4 3
            6 2
            3 1
            5 1}
           (sut/count-by-length
            ["beep" "abc" "apple" "things" "toffee" "camp" "data" "clojure"])))))