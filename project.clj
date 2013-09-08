(defproject storm-starter-minimum "0.1.0-SNAPSHOT"
  :source-paths ["src/clj"]
  :java-source-paths ["src/java"]
  :aot :all
  :dependencies []
  :profiles {:dev
             {:dependencies [[storm "0.8.2"]
                             [org.clojure/clojure "1.4.0"]]}})
