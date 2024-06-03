(ns exercises.more-practice.modelling-todo-list)

;; Devise a data model to represent a multi-user todo list.

;; Next, come up with and write a few helper functions to work with your model,
;; such as:

;; incomplete-tasks-for - given then id of user,
;; returns a list of their incomplete tasks

;; completed-tasks - returns a list of all completed tasks


(def todo-list
  {1 {:user-id 1
      :name    "Bob"
      :tasks   [{:task-id   1
                 :name      "Buy fruits, vegetables, milk, eggs, and bread."
                 :completed true}
                {:task-id   2
                 :name      "Check for any missing ingredients needed for the week's meal plans."
                 :completed false}]}
   2 {:user-id 2 
      :name    "Kevin"
      :tasks   [{:task-id   1
                 :name      "Finalize the presentation slides."
                 :completed true}
                {:task-id   2
                 :name      "Review and edit the project report."
                 :completed false}
                {:task-id   3
                 :name      "Send the report to the team for feedback."
                 :completed false}]}
   3 {:user-id 3
      :name    "Stuart"
      :task    [{:name      "Go for a 30-minute run."
                 :completed true}
                {:name      "Do a 20-minute strength training workout."
                 :completed true}
                {:name      "Schedule an annual check-up appointment."
                 :completed false}]}})

(defn incomplete-tasks-for [todo-list user-id]
  (filter #(not (:completed %))
          (:tasks (get todo-list user-id))))

(defn completed-tasks [todo-list]
  (reduce
   (fn [acc user]
     (let [completed-tasks (filter :completed (:tasks user))]
       (concat acc completed-tasks)))
   []
   (vals todo-list)))

(comment
  (def todo-list-state
    {:users {1 {:name "rafd"}
             2 {:name "jamesnvc"}}
     :tasks [{:id               1
              :completed?       false
              :created-user-id  1
              :assigned-user-id 2
              :created-at       #inst "2019-10-24T19:47:05-05:00"
              :content          "Get everything ready for teaching"}
             {:id               2
              :completed?       true
              :created-user-id  2
              :assigned-user-id 2
              :created-at       #inst "2019-10-20T19:47:05-05:00"
              :content          "Make a bunch of exercises"}
             {:id               3
              :completed?       false
              :created-user-id  2
              :assigned-user-id 1
              :created-at       #inst "2019-10-27T19:47:05-05:00"
              :content          "Teach the class"}]})

  (defn incomplete-tasks-for
    [state user-id]
    (filter (fn [task]
              (= user-id (task :assigned-user-id)))
            (state :tasks)))

  (defn completed-tasks
    [state]
    (filter :completed? (state :tasks))))