(ns tiy-homework-fizz-buzz-clojure.core)


(defn -main [])



(defn fizz-buzz [start end]
  (for [x (range start (+ end 1))]
       (cond
         (= (mod x 15) 0) "FizzBuzz"
         (= (mod x 3) 0)  "Fizz"
         (= (mod x 5) 0)  "Buzz"
         :else x)))




(println (fizz-buzz 1 100))
(-main)
