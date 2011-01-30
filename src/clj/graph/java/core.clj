(ns clj.graph.java.core
  (:use [clj-graph.core :as clj-graph])
  (:import [java.util Map HashSet])
  (:gen-class
   :name clj.graph.Core
   :methods [[cliques [java.util.Map] java.util.HashSet]]))

(defn jmapset-to-cljmapset [jmapset]
  (let [ks (seq (.keySet jmapset))
        vs (map (fn [k] (set (.get jmapset k)))
                ks)]
    (zipmap ks vs)))

(defn cljsetset-to-jsetset [cljsetset]
  (let [jsetset (java.util.HashSet.)]
    (doseq [cljset cljsetset]
      (.add jsetset (java.util.HashSet. cljset)))
    jsetset))

(defn -cliques
  "A Java-callable wrapper around the 'cliques' function."
  [this jgraph]
  (cljsetset-to-jsetset (clj-graph/cliques (jmapset-to-cljmapset jgraph))))
