(ns rna-transcription
  (:require [clojure.string :as s]))

(defn to-rna [dna]
  (let [rna-dict {\C "G"
                  \G "C"
                  \A "U"
                  \T "A"}
        mapped-dna (map rna-dict dna)]
    (if (some #(when (= % nil) true) mapped-dna)
      (throw (AssertionError. "Wrong input."))
      (apply str mapped-dna))))




