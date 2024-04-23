(ns exercises.first-step.scrabble-score-test
  (:require [clojure.test :refer [deftest is testing]]
            [exercises.first-step.scrabble-score :as sut]))

(deftest score-test
  (testing "Context of the test assertions"
    (is (= 8 (sut/score "hello")))

    (is (= 17 (sut/score "question")))

    (is (= 35 (sut/score "quizzed"))))) 