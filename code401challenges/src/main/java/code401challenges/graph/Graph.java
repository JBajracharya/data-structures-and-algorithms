package code401challenges.graph;

import java.util.*;

public class Graph <T> {
    private Map< T, List<Edge<T>>> map = new HashMap<>();

    public void addNode( T node) {
        map.put(node, new LinkedList<Edge<T>>());
    }

    public void addEdge(T source, T destination, boolean bidirectional, int weight) {
        if(!map.containsKey(source)){
            addNode(source);
        }
        if(!map.containsKey(destination)) {
            addNode(destination);
        }
        map.get(source).add(new Edge<>(destination, weight));

        if(bidirectional == true) {
            map.get(destination).add(new Edge<>(source, weight));
        }
    }

    public Set<T> getNodes() {
        return map.keySet();
    }

    public List<Edge<T>> getNeighbors(T node) {
        return map.get(node);
    }

    public int size() {
        return map.size();
    }
}
