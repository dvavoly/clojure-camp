(ns exercises.exploring-functions.ergex-exctraction)

;; Given a string like "Lastname, Firstname (some title)",
;; use a regular expression to extract out the first name, last name, and title.

(defn extract-info
  [info-str]
  (let [[_ last-name first-name title]
        (re-matches #"([^,]+), ([^(]+) \(([^)]+)\)" info-str)]
    {:first first-name
     :last last-name
     :title title}))