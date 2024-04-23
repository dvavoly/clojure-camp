(ns exercises.first-step.scrabble-score
  (:require [clojure.string :as string]))

;; Implement a function score that calculates the scrabble score for a given word.
;; Use google to find out how much each letter is worth.

;; 1 point - A, E, I, O, U, L, N, S, T, R.
;; 2 points - D, G.
;; 3 points - B, C, M, P.
;; 4 points - F, H, V, W, Y.
;; 5 points - K.
;; 8 points - J, X.
;; 10 points - Q, Z.
;; 0 points - Blank Tiles.

(def char-to-numbers
  {\A 1, \E 1, \I 1, \O 1, \U 1, \L 1, \N 1, \S 1, \T 1, \R 1,
   \D 2, \G 2,
   \B 3, \C 3, \M 3, \P 3,
   \F 4, \H 4, \V 4, \W 4, \Y 4,
   \K 5,
   \J 8, \X 8,
   \Q 10, \Z 10})

(defn score
  [s]
  (->> s
       string/upper-case
       seq
       (map char-to-numbers)
       (apply +)))