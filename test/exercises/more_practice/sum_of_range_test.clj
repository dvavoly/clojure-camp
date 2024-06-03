(ns exercises.more-practice.sum-of-range-test
  (:require
   [clojure.test :refer [deftest is]]
   [exercises.more-practice.sum-of-range :as subject]))

(deftest sum-to-test
  (is (= 15
         (subject/sum-to 5))))