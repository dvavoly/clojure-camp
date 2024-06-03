(ns exercises.exploring-functions.deep-add-test
  (:require
   [clojure.test :refer [deftest is]]
   [exercises.exploring-functions.deep-add :as subject]))

(deftest add-info-test
  (is (= {:people {1 {:stuff "beep boop"
                      :name "james"
                      :points 1}
                   2 {:name "rafd"
                      :points 5}}}
         (subject/add-info {:people {1 {:name "james"
                                        :points 1}
                                     2 {:name "rafd"
                                        :points 5}}}
                           1
                           :stuff
                           "beep boop"))))