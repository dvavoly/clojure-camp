(ns exercises.exploring-functions.map-indexed-test
  (:require
   [clojure.test :refer [deftest is]]
   [exercises.exploring-functions.map-indexed :as sut]))

(deftest increasing-repeat-test
  (is (= [:a :b :b :c :c :c :d :d :d :d :e :e :e :e :e]
         (sut/increasing-repeat [:a :b :c :d :e])))
  )
