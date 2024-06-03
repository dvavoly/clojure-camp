(ns exercises.exploring-functions.grouping-things-test
  (:require
   [clojure.test :refer [deftest is]]
   [exercises.exploring-functions.grouping-things :as subject]))

(deftest categorise-test
  (is (= {7 ["clojure"]
          4 ["beep" "camp" "data"]
          6 ["things" "toffee"]
          3 ["abc"]
          5 ["apple"]}
         (subject/categorise
          ["beep" "abc" "apple" "things" "toffee" "camp" "data" "clojure"]))))