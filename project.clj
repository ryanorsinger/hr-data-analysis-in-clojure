; namespace
(ns hr-data-analysis)

; the imports
(require '[tablecloth.api :as tc])

; sanity check
(+ 2 2)

; defn defines a function.
; the last expression of defn is the "return"
(defn add-one [x]
  (+ x 1))

; calling a function
(add-one 2)
(* 4 2)

; functions are "first class"
; functions can be used as inputs to other functions
; functions can be returned from other functions 
; first class => use a function as if it was any variable
; map function takes another function as an argument
; map runs your function on all elements of the input collection
; map returns as many elements as it was given
(map add-one [1 2 3 4])

; apply applies a function to a collection
; revisit apply later
(apply + [1 2 3])
(+ 1 2 3)

; def defines a var (like a variable)
(def employees
  ; tc/dataset creates a tc dataset ouf of the CSV file
  (tc/dataset "./employee_attrition_performance.csv"))

employees

(tc/info employees)
(tc/info employees :basic)
(tc/info employees :columns)

(tc/column-names employees)
    

; How to access a column in a tc dataset?

; I want to access the "MonthlyIncome" column
; get the average salary

(reduce + [2 3 4 4 5 9])
(reduce + [1 2 3])

; define an 
(defn avg [x]
  (/ (apply + x) (count x)))

(avg [1 2 3])
(avg [2 2 2])

(reduce + [1 2 3])
(apply + [1 2 3])

(reduce + [1 2 3])
(apply + [1 2 3])

; (reduce + x)
(reduce * [1 2 3 4])



; call tc/aggregate on ds to sum up all the Montly Income
(tc/aggregate employees #(reduce + (% "MonthlyIncome")))

; Calculate the overall average monthly income
; 6305
(tc/aggregate employees #(avg (% "MonthlyIncome")))

