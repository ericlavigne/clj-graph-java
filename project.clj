(defproject clj-graph-java "0.1"
  :description "Java bindings for clj-graph network graph analysis library"
  :dependencies [[org.clojure/clojure "1.2.0"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [clj-graph "0.1"]]
  :aot [clj.graph.java.core])
