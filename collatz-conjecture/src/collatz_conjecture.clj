 (ns collatz-conjecture)

(defn collatz-helper [n]
  (if (= n 1)
    n
    (if (even? n)
      (/ n 2)
      (+ (* n 3) 1))))

(defn collatz [n]
  (assert (pos? n))
  (count (take-while #(> % 1) (iterate collatz-helper n))))
