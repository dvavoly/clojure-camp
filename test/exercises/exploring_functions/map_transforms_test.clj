(ns exercises.exploring-functions.map-transforms-test
  (:require [clojure.test :refer [deftest is testing]]
            [exercises.exploring-functions.map-transforms :as sut]))

(deftest map-transform-test
  (testing "Context of the test assertions"
    (is (= {:name "james"
            :points 1
            :activated "now"}
           (sut/activate {:name "james"
                      :points 0
                      :disabled? true})))

    (is (= {:name "james"
            :points 1
            :activated "now"
            :beep (quote boop)
            :blaap 123}
           (sut/activate {:name "james"
                          :points 0
                          :beep (quote boop)
                          :blaap 123
                          :disabled? true}))))) 