(ns exercises.exploring-functions.java-interop-test
  (:require
   [clojure.test :refer [deftest is]]
   [exercises.exploring-functions.java-interop :as sut]))

(deftest sha256-test
  (is (= "b94d27b9934d3e08a52e52d7da7dabfac484efe37a5380ee9088f7ace2efcde9"
         (sut/sha256 "hello world"))))