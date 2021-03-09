(ns rna-transcription
  (:require [clojure.string :as s]))

(defn to-rna [dna]
  (let [rna-dict {\C "G"
                  \G "C"
                  \A "U"
                  \T "A"}]
    (when (not= (count (re-seq #"[C|G|A|T]" dna)) (count dna)) (throw (AssertionError. "Wrong input.")))
    (s/join "" (into '() (reduce #(str (get rna-dict %2) %1) "" dna)))))
