(defproject clojure-hadoop "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.5.1"]                                     

                 [cascalog "2.0.0"]                                                 
                 [backtype/dfs-datastores "1.1.2"]                                  
                 [org.apache.thrift/libthrift "0.8.0"                               
                  :exclusions [org.slf4j/slf4j-api]]]

                 ;[cascalog/cascalog-core "2.0.0"]

  :jvm-opts ["-Xms768m" "-Xmx768m"]
  :source-paths ["src"]

;  :profiles { :dev {:dependencies [[org.apache.hadoop/hadoop-core "0.20.2-dev"]]}}

  :profiles {
    :provided
        {
            :dependencies [[org.apache.hadoop/hadoop-core "0.20.2-dev"]
  ]

        }}
;  :aot :all-with-unused
  :main wc.core

  :uberjar-name "your-jar.jar"
)

