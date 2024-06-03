(ns exercises.exploring-functions.partial-map-test
  (:require
   [clojure.test :refer [deftest is]]
   [exercises.exploring-functions.partial-map :as subject]))

(deftest partial-map-test
  (is (= [1 20 3 40 5 60]
         (subject/partial-map (fn [x]
                                (* x 10))
                              even?
                              [1 2 3 4 5 6]))))