(ns exercises.exploring-functions.summing-a-list-atom)

;; Write a function to sum a list of numbers, using an atom and doseq.

(comment
  (defn sum-list [numbers]
    (let [sum (atom 0)] ; Initializing an atom to store the sum
      (doseq [num numbers]
        (swap! sum + num)) ; Updating the atom by adding each number
      @sum)) ; Returning the dereferenced value of the atom, which holds the sum

  (println (sum-list [1 2 3 4 5])) ; Example usage
  )

(defn sum [numbers]
  (let [sum  (atom 0)]
    (doseq [num numbers]
      (swap! sum + num))
    @sum))
