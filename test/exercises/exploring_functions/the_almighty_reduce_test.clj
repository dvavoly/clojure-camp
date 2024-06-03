(ns exercises.exploring-functions.the-almighty-reduce-test
  (:require
   [clojure.test :refer [deftest is]]
   [exercises.exploring-functions.the-almighty-reduce :as sut]))

(deftest long-lengths-test
  (is (= [8 6 7]
         (sut/long-lengths ["foo" "aoeusnth" "q" "aoeus" "abcdef" "1234567"]))))