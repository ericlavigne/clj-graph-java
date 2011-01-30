# clj-graph-java

Java bindings for clj-graph network graph analysis library

## Usage

A network is represented as a Map. The map should have a key for each node in the network. For each key in the map, the value should be the set of other nodes to which the key is connected. The following example should give you an idea of how to set up the network and calculate the cliques for that network. In this example, all nodes are of type Cat. 

        java.util.Map<Cat,Set<Cat>> network = Maps.newHashMap();
        for(Cat cat : allCats) {
            network.put(cat, toWhichCatsIsThisCatConnected(cat));
        }
        Set<Set<Cat>> cliques = 
            (Set<Set<Cat>>) new clj.graph.Core().cliques(network);

A clique is represented by a Set of nodes (Set<Cat> in the example, because nodes are of type Cat). The result of cliques is a Set of Sets of nodes because there could be more than one clique.

## License

Copyright (C) 2010 Eric Lavigne

Distributed under the Eclipse Public License, the same as Clojure.
