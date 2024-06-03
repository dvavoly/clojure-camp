(ns exercises.exploring-functions.run-length-decode-test
  (:require
   [clojure.test :refer [deftest is]]
   [exercises.exploring-functions.run-length-decode :as subject]))

(deftest run-length-decode-test
  (is (= [:a :a :a :b :b :c :d :d :d :d]
         (subject/run-length-decode [[:a 3] [:b 2] [:c 1] [:d 4]]))))