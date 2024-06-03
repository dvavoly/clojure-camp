(ns exercises.exploring-functions.summing-a-list-safe-recursion-test
  (:require
   [clojure.test :refer [deftest is]]
   [exercises.exploring-functions.summing-a-list-safe-recursion :as subject]))

(deftest sum-test
  (is (= 10 (subject/sum [1 2 3 4])))

  (is (= 0 (subject/sum [])))

  (is (= 0 (subject/sum [1 -1 1 -1 1 -1 0]))))