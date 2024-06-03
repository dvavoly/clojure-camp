(ns exercises.exploring-functions.using-sets-test
  (:require
   [clojure.test :refer [deftest is]]
   [exercises.exploring-functions.using-sets :as subject]))

(deftest interests-info-test
  (is (= {:unique-a #{"reading" "lifting"}
          :all      #{"sculpting" "reading" "lifting" "programming" "movies"
                      "boardgames"}
          :unique-b #{"sculpting" "movies"}
          :shared   #{"programming" "boardgames"}}
         (subject/interests-info #{"reading" "lifting" "programming" "boardgames"}
                                 #{"sculpting" "programming" "movies" "boardgames"}))))