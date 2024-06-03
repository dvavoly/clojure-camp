(ns exercises.exploring-functions.ergex-exctraction-test
  (:require
   [clojure.test :refer [deftest is]]
   [exercises.exploring-functions.ergex-exctraction :as subject]))

(deftest extract-info-test
  (is (= {:title "Cool Person"
          :first "Hello"
          :last "World"}
         (subject/extract-info "World, Hello (Cool Person)")))

  (is (= {:title "🐱"
          :first "Garf Buzz"
          :last "Beep-Boop III"}
         (subject/extract-info "Beep-Boop III, Garf Buzz (🐱)"))))