package code401challenges.graph;

import java.util.*;

public class Graph <T> {
    private Map< Node<T>, List<Edge<T>>> map = new HashMap<>();

    public void addNode( Node<T> node) {
        map.put(node, new LinkedList<Edge<T>>());
    }

    public void addEdge(Node<T> source, Node<T> destination, boolean bidirectional, int weight) {
        if(!map.containsKey(source)){
            addNode(source);
            System.out.println("source.value = " + source.value);
        }
        if(!map.containsKey(destination)) {
            addNode(destination);
        }
        System.out.println("source = " + map.get(source.value));
        map.get(source).add(new Edge<T>(destination, weight));

        if(bidirectional == true) {
            map.get(destination).add(new Edge<T>(source, weight));
        }
    }

    public Set<Node<T>> getNodes() {
        return map.keySet();
    }

    public List<Edge<T>> getNeighbors(T node) {
        return map.get(node);
    }

    public int size() {
        return map.size();
    }
}
