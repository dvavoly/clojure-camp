(ns exercises.first-step.space-age)

;; Implement a function that lets someone
;; convert their age on one planet to their age on another.

;; For example:

;; 30 years on Earth is about 1 year on Saturn
;; (a year being a single revolution around the sun).

;; 10 years on Mars is 78 years on Mercury.

;; You will need to look up the relevant data on planets yourself.
(def planets
  {:mercury 88
   :venus   225
   :earth   365
   :mars    687
   :jupiter 4333
   :saturn  10759
   :uranus  30687
   :neptune 60190})

(defn space []
  (filter #() (range 1 10)))

(defn second []
  (filter even? (range 1 20)))