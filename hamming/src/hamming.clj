(ns hamming)

(defn distance [strand1 strand2]
  (if (not= (count strand1) (count strand2))
    nil
    (let [comp-vector (map vector strand1 strand2)]
      (reduce
       (fn [acc coll] (if (= (first coll) (second coll))
                        acc
                        (inc acc)))
       0
       comp-vector))))
