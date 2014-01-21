(ns wc.core
    (require '[cascalog.logic.def :as def])
    (require '[cascalog.logic.ops :as c])
    (use 'cascalog.api)
    (:gen-class))



(def/defmapcatfn tokenise [line]
  "reads in a line of string and splits it by a regular expression"
  (clojure.string/split line #"[\[\]\\\(\),.)\s]+"))


(<- [?word ?count]
        (sentence :> ?line)
        (tokenise :< ?line :> ?word)
        (c/count :> ?count))

