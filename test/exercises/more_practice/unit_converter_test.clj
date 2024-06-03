(ns exercises.more-practice.unit-converter-test
  (:require
   [clojure.test :refer [deftest is]]
   [exercises.more-practice.unit-converter :as subject]))

#_(deftest convert-test
  (is (= 100 (subject/convert 220 :lb :kg)))

  (is (= 45 (subject/convert 20.45 :kg :lb)))

  (is (= -18 (subject/convert 0 :fahrenheit :celsius)))

  (is (= -40 (subject/convert -40 :celsius :fahrenheit)))

  (is (= 49 (subject/convert 15 :meters :feet)))

  (is (= 590 (subject/convert 15 :meters :inches))))