(ns exercises.exploring-functions.associative-collections-test
  (:require [clojure.test :refer [deftest is testing]]
            [exercises.exploring-functions.associative-collections :as sut]))

(deftest set-and-get-test
  (testing "Context of the test assertions"
    (is (= [1 [2 3 4]] (sut/get-and-set 0 2 [1 3 4])))

    (is (= ["foo"
            {:b "quux"
             :a "baz"}]
           (sut/get-and-set :a
                            "baz"
                            {:b "quux"
                             :a "foo"})))))