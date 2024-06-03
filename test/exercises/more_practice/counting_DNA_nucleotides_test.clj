(ns exercises.more-practice.counting-DNA-nucleotides-test
  (:require
   [clojure.test :refer [deftest is]]
   [exercises.more-practice.counting-DNA-nucleotides :as subject]))

(deftest count-nucleotides-test
  (is
   (= {"T" 21
       "G" 17
       "C" 12
       "A" 20}
      (subject/count-nucleotides
       "AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC"))))