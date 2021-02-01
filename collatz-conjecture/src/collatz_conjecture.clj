 (ns collatz-conjecture)

(defn collatz [num]
  (if (<= num 0)
    (throw (AssertionError. "Wrong input"))
    (loop [n num count 0]
      (if (= n 1)
        count
        (if (even? n)
          (recur (/ n 2) (inc count))
          (recur (+ (* n 3) 1) (inc count)))))))

