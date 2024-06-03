(ns exercises.exploring-functions.merging-maps-test
  (:require
   [clojure.test :refer [deftest is]]
   [exercises.exploring-functions.merging-maps :as sut]))

(deftest join-maps-test
  (is (= [{:b 2
           :a 1}
          {:b 3
           :a 2}
          {:b 4
           :a 3}]
         (sut/join-maps [{:a 1} {:a 2} {:a 3}] [{:b 2} {:b 3} {:b 4}]))))