(ns exercises.more-practice.destructuring-test
  (:require
   [clojure.test :refer [deftest is]]
   [exercises.more-practice.destructuring :as subject]))

(deftest process-person-test
  (is (= {:description "James is 30 years old.\nThey like highland games and 2 other things."
          :name        "James"
          :info        {:age       30
                        :interests ["highland games" "code" "reading"]}}
         (subject/process-person ["James"
                                  {:age       30
                                   :interests ["highland games" "code" "reading"]}]))))