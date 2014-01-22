(ns wc.core
    (:gen-class))

(use 'cascalog.api)

(require '[cascalog.logic.def :as def])
(require '[cascalog.logic.ops :as c])


(def/defmapcatfn tokenise [line]
  "reads in a line of string and splits it by a regular expression"
  (clojure.string/split line #"[\[\]\\\(\),.)\s]+"))



(defn -main [src-dir output-dir]
    (?<- (hfs-textline output-dir) [?word ?count]
            ((hfs-textline output-dir) :> ?line)
            (tokenise :< ?line :> ?word)
            (c/count :> ?count))
    )

