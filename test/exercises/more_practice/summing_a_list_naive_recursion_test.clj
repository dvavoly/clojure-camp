(ns exercises.more-practice.summing-a-list-naive-recursion-test
  (:require
   [clojure.test :refer [deftest is]]
   [exercises.more-practice.summing-a-list-naive-recursion :as subject]))

(deftest sum-test
  (is (= 10 (subject/sum [1 2 3 4])))

  (is (= 0 (subject/sum [])))

  (is (= 0 (subject/sum [1 -1 1 -1 1 -1 0]))))