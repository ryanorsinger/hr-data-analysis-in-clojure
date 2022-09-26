(require '[tablecloth.api :as tc])


;; (ns analysis
;;   (require '[tablecloth.api :as tc]))
  



(def employees
  "./employee_attrition_performance.csv")

(+ 2 2)

;; (-> employees
;;     (tc/dataset {:key-fn keyword})
;;     (tc/group-by (fn [row]
;;                    {:symbol (:symbol row)
;;                     :year (tech.v3.datatype.datetime/long-temporal-field :years (:date row))}))
;;     (tc/aggregate #(tech.v3.datatype.functional/mean (% :price)))
;;     (tc/order-by [:symbol :year])
;;     (tc/head 10))