(ns exercises.exploring-functions.deep-update-test
  (:require
   [clojure.test :refer [deftest is]]
   [exercises.exploring-functions.deep-update :as subject]))

(deftest update-info-test
  (is (= {:people {1 {:name "james"
                      :points 1}
                   2 {:name "RAFD"
                      :points 8}}}
         (subject/update-info {:people {1 {:name "james"
                                           :points 1}
                                        2 {:name "rafd"
                                           :points 5}}} 2 3))))
