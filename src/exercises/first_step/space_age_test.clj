(ns exercises.first-step.space-age-test
  (:require [clojure.test :refer [deftest is testing]]
            [exercises.first-step.space-age :as sut]))
(deftest convert-space-age-test
  (testing "Context of the test assertions"

    (is (= 1 (sut/convert-space-age 30 :earth :saturn)))
    
    (is (= 78 (sut/convert-space-age 10 :mars :mercury))))) 