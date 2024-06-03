(ns exercises.exploring-functions.insert-in-vector-test
  (:require
   [clojure.test :refer [deftest is]]
   [exercises.exploring-functions.insert-in-vector :as subject]))

(deftest insert-at-test
  (is (= [1 2 3 4] (subject/insert-at [1 3 4] 1 2))))