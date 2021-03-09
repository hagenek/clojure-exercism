(ns bob
  (:require [clojure.string :as s]))

(defn all-caps? [s] (let [letters (filter #(Character/isLetter %) s)]
                      (and (every? #(Character/isUpperCase %) letters)
                           (> (count letters) 0))))

(defn response-for
  "Serves you Bob's responses given a string input"
  [s]
  (let [fs (s/trim s)]
    (cond
      (= (count fs) 0)
      "Fine. Be that way!"
      (and (all-caps? fs) (not (s/ends-with? fs "?")))
      "Whoa, chill out!"
      (all-caps? fs)
      "Calm down, I know what I'm doing!"
      (s/ends-with? fs "?")
      "Sure."
      :else
      "Whatever.")))




