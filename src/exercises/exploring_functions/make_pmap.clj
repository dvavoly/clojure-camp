(ns exercises.exploring-functions.make-pmap)

;; _pmap_ is a built-in function that acts just like _map_,
;; except it runs the functions over the collection in parallel.

;; Implement your own version of _pmap_ and test that it works by using _time_
;; to compare the performance of the normal _map_ and your version of _pmap_.
;; You can use _Thread/sleep_ inside a function to simulate a long running process.

(map)