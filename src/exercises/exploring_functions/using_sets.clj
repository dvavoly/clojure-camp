(ns exercises.exploring-functions.using-sets 
  (:require [clojure.set :as set]))

;; Given two sets of user interests, return sets indicating:
;; (1) their common interests,
;; (2) each of their unique interests, and
;; (3) all of their interests.

(defn interests-info [a b]
  {:unique-a (set/difference a b)
   :unique-b (set/difference b a)
   :all (set/union a b)
   :shared (set/intersection a b)})
