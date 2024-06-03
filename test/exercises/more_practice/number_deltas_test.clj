(ns exercises.more-practice.number-deltas-test
  (:require
   [clojure.test :refer [deftest is]]
   [exercises.more-practice.number-deltas :as subject]))

(deftest deltas-test
  (is (= [1 1 2 -8 13]
         (subject/deltas [1 2 3 5 -3 10]))))