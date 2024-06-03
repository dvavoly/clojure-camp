(ns exercises.more-practice.dot-products-test
  (:require
   [clojure.test :refer [deftest is]]
   [exercises.more-practice.dot-products :as subject]))

(deftest dot-test

  (is (= 0 (subject/dot [1 0] [0 1])))

  (is (= 3 (subject/dot [1 1 1] [1 1 1])))

  (is (= 32 (subject/dot [1 2 3] [4 5 6]))))