(ns exercises.more-practice.counting-DNA-nucleotides 
  (:require [clojure.string :as string]))

(defn count-nucleotides [s]
  (-> s
      (string/split #"")
      frequencies))

#_(count-nucleotides "AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC")