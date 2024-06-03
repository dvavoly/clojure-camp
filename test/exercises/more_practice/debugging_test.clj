(ns exercises.more-practice.debugging-test
  (:require
   [clojure.test :refer [deftest is]]
   [exercises.more-practice.debugging :as subject]))

(deftest process-test

  (is (= {:str-things ["hello" "2" ":world" "1"]
          :sum 3}
         (subject/process ["hello" 2 :world 1])))

  (is (= 3 (:sum (subject/process ["hello" 2 :world 1])))))