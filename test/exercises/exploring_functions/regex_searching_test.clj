(ns exercises.exploring-functions.regex-searching-test
  (:require
   [clojure.test :refer [deftest is]]
   [exercises.exploring-functions.regex-searching :as subject]))

(deftest find-phone-numbers-test
  (is
   (=
    ["(416) 333 4444" "+1 647 123 4578" "1-800-888-9999" "905 777-1111"]
    (subject/find-phone-numbers
     "Here's a bunch of text call (416) 333 4444 and +1 647 123 4578 gurf 1- 416)123-4567 some more garbage 123_123_4567 but don't call from 1-800-888-9999 and why not? here's 905 777-1111"))))