(ns exercises.more-practice.destructuring)

(comment
;;   Refactor the below function to use destructuring instead of unpacking values
  (defn process-person
    [arg]
    (let [name (first arg)
          info (second arg)
          age (:age info)
          interests (:interests info)
          interest-1 (first interests)
          other-interests (rest interests)]
      {:description (str name
                         " is "
                         age
                         " years old.\n"
                         "They like "
                         interest-1
                         " and "
                         (count other-interests)
                         " other things.")
       :name name
       :info info})))

(defn process-person [arg]
  (let [[name info] arg
        age (:age info)
        interests (:interests info)
        [interest-1 & other-interests] interests]
    {:description (str name
                       " is "
                       age
                       " years old.\n"
                       "They like "
                       interest-1
                       " and "
                       (count other-interests)
                       " other things.")
     :name name
     :info info}))

(comment
  "Example solution"
  (defn process-person
    [[name
      {:keys [age]
       [interest-1 & other-interests] :interests
       :as info}]]
    {:description (str name
                       " is "
                       age
                       " years old.\n"
                       "They like "
                       interest-1
                       " and "
                       (count other-interests)
                       " other things.")
     :name name
     :info info})

  (defn process-person-2
    "Alternate solution that split things up a bit more"
    [[name
      {:keys [age interests]
       :as info}]]
    (let [[interest-1 & other-interests] interests]
      {:description (str name
                         " is "
                         age
                         " years old.\n"
                         "They like "
                         interest-1
                         " and "
                         (count other-interests)
                         " other things.")
       :name name
       :info info}))
  )