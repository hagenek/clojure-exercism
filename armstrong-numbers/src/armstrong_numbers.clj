(ns armstrong-numbers)

(defn length-of-n
  [n]
  (Math/floor (+ (Math/log10 n) 1)))

(defn hagenek-exp [base pow]
  (apply * (take pow (repeat base))))

(defn armstrong? [n]
  (let [arm-sum (->>  (iterate #(quot % 10) n)
                      (take-while #(> % 0))
                      (map #(hagenek-exp (mod % 10) (length-of-n n)))
                      (reduce +))]
    (= arm-sum n)))
