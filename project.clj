(defproject clojure-hadoop "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/math.numeric-tower "0.0.2"]
                 [cascalog/cascalog-core "2.0.0"]]
  :jvm-opts ["-Xms768m" "-Xmx768m"]
  :profiles { :dev {:dependencies [[org.apache.hadoop/hadoop-core "1.1.2"]

                                  [midje "1.5.1"
                                   :exclusions [org.apache.httpcomponents/httpcore
                                                commons-io]]
                                                ]}}
  :main your-main
  :uberjar-name "your-jar.jar"
)

