(ns exercises.first-step.refactor-ifs)

(comment
  ;Refactor the below code to use a single cond instead of multiple ifs.
  ;Also, consider re-ordering the conditionals to simplify the logic.
  (defn process-value
    [value]
    (if (and (number? value) (> value 10))
      :pretty-big
      (if (and (number? value) (< value 0))
        :negative
        (if (and (number? value) (zero? value))
          :zero
          (if (number? value)
            :small-number
            (if (string? value)
              :a-string
              :something-else)))))))

(defn process-value
  [numbers]
  
  (cond
    (string? numbers) :a-string
    (and (number? numbers) (zero? numbers)) :zero
    (and (number? numbers) (< numbers 0)) :negative
    (and (number? numbers) (< numbers 10)) :small-number
    (number? numbers) :pretty-big
    :else :something-else))

#_(defn process-value
  [number]
  (assert (number? number))
  (cond
    (string? number) :a-string
    (= 0 number) :zero
    (> 0 number) :negative
    (> 10 number) :small-number
    (number? number) :pretty-big
    :else :something-else))
