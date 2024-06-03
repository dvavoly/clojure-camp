(ns exercises.exploring-functions.grouping-things-continued-test
  (:require [clojure.test :refer [deftest is testing]]
            [exercises.exploring-functions.grouping-things-continued :as subject]))

(deftest gouping-things-continued-test
  (testing "Context of the test assertions"
    (is (= {1 {7 ["clojure"]
               6 ["toffee"]
               3 ["abc"]
               5 ["apple"]}
            3 {12 ["so much data"]}
            2 {12 ["clojure camp"]
               9  ["beep boop"]
               10 ["two things"]}}
           (subject/categorise ["beep boop"
                                "abc"
                                "apple"
                                "two things"
                                "toffee"
                                "clojure camp"
                                "so much data"
                                "clojure"])))))