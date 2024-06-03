(ns exercises.exploring-functions.basic-files
  (:require [clojure.string :as string]))

;; Read in a text file (assuming it's in the current directory),
;; reverse the file's contents, and write the result to a new file
;; (the name now prefixed by "rev-").

;; (spit (str "rev-" file-name) (string/reverse (slurp file-name)))

(defn reverse-file
  [file-name]
  (->>
   (slurp file-name)
   (string/reverse)
   (spit (str "rev-" file-name))))
