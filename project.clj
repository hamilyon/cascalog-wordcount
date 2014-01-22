(defproject cascalog-wordcount "0.1.0-SNAPSHOT"
  :description "minimal working cascalog example"
  :url "https://github.com/hamilyon/cascalog-wordcount"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [cascalog "2.0.0"]
                 [backtype/dfs-datastores "1.1.2"]]

  :jvm-opts ["-Xms768m" "-Xmx768m"]
  :source-paths ["src"]

  :profiles {
    :provided {
        :dependencies [[org.apache.hadoop/hadoop-core "0.20.2-dev"]]
     }
   }
  :main wc.core

  :uberjar-name "your-jar.jar"
)

