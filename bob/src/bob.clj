(ns bob
  (:require [clojure.string :as s]))

(defn all-caps? [s]
  (let [fs (s/replace (s/join "" (drop-last s)) " " "")]
    (if (empty? fs) false
        (if (every? #(Character/isUpperCase %) fs)
          true
          false))))

(defn response-for
  "Serves you Bob's responses given a string input"
  [s]
  (let [fs (s/trim s)]
    (if (and (all-caps? fs) (not (= (last fs) \?)))
      "Whoa, chill out!"
      (if (and  (all-caps? fs) (= (last fs) \?))
        "Calm down, I know what I'm doing!"
        (if (and  (= (last fs) \?) (not (all-caps? s)))
          "Sure."
          (if (and  (= (last fs) \!)
                    (not (Character/isLowerCase (nth s (- (count s) 2)))))
            "Whoa, chill out!"
            (if (s/includes? fs "!?")
              "Calm down, I know what I'm doing!"
              (if (= (last fs) "?!")
                "Calm down, I know what I'm doing!"
                (if (empty? fs)
                  "Fine. Be that way!"
                  "Whatever.")))))))))



