(ns reverse-string)

(defn reverse-string [s]
  (loop [input-string s xs '()]
    (if (empty? input-string)
      (apply str xs)
      (recur (rest input-string) (conj xs (first (seq input-string)))))))
