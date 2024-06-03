(ns exercises.more-practice.debugging)

(defn process
  "For a given list, return the sum of all the
  numbers as well as all the values as strings."
  [things]
  (let [sum (atom 0)
        str-things (for [thing things]
                     (do (when (number? thing)
                           (swap! sum + thing))
                         (str thing)))]
    {:str-things str-things
     :sum @sum}))
