(ns exercises.exploring-functions.remove-from-vector-test
  (:require
   [clojure.test :refer [deftest is]]
   [exercises.exploring-functions.remove-from-vector :as subject]))

(deftest dissoc-at-test
  (is (= [1 3 4] (subject/dissoc-at [1 2 3 4] 1))))