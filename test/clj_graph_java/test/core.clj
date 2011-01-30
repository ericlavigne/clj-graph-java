(ns clj-graph-java.test.core
  (:import [clj.graph Core])
  (:use clj.graph.java.core
        clj-graph.core
        clojure.test))

(deftest test-cliques
  (let [network (random-graph {:num-nodes 20 :density 0.7})]
    (is (= (count (cliques network))
           (count (.cliques (Core.) network)))
        "Wrapper should give the same result as the original.")))
