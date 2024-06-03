(ns exercises.more-practice.2d-transpose-test
  (:require
   [clojure.test :refer [deftest is]]
   [exercises.more-practice.2d-transpose :as sut]))

(deftest transpose-test
  (is (= [[1 2 3] [4 5 6]]
         (sut/transpose [[1 4] [2 5] [3 6]]))))