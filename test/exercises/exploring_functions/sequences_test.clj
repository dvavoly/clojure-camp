(ns exercises.exploring-functions.sequences-test
  (:require
   [clojure.test :refer [deftest is]]
   [exercises.exploring-functions.sequences :as subject]))

(deftest add-element-test
  (is (= (quote (:a 2 3 4)) (subject/add-element :a (list 2 3 4))))

  (is (= [2 3 4 :a] (subject/add-element :a [2 3 4])))

  (is (= #{4 3 2 :a} (subject/add-element :a #{4 3 2}))))