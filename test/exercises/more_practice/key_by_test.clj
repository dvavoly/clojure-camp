(ns exercises.more-practice.key-by-test
  (:require
   [clojure.test :refer [deftest is]]
   [exercises.more-practice.key-by :as subject]))

(deftest key-by-test
  (is (= {456 {:name "Bob"
               :id 456}
          123 {:name "Alice"
               :id 123}}
         (subject/key-by :id
                         [{:name "Alice"
                           :id 123}
                          {:name "Bob"
                           :id 456}])))

  (is (= {665036798 "Bob"
          -213842911 "Alice"}
         (subject/key-by hash ["Alice" "Bob"]))))