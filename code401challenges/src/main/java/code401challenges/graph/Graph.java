package code401challenges.graph;

import java.util.*;

public class Graph {
    Set<Vertix> vertices;

    public Graph() {
        this.vertices = new HashSet<>();
    }

    public Vertix addNode(String name) {
        Vertix vertix = new Vertix(name);
        vertices.add(vertix);
        return vertix;
    }

    public void addEdge(Vertix source, Vertix destination, int weight) {
        source.connectingEdges.add(new Edge(weight, destination));
        destination.connectingEdges.add(new Edge(weight,source));
    }
    
    public Set<Vertix> getNodes() {
        return vertices;
    }

    public List<Edge> getNeighbors(Vertix vertix) {
//        System.out.println("vertix.connectingEdges.toString() = " + vertix.connectingEdges.toString());
        return vertix.connectingEdges;
    }

    public List<Vertix> breadthFirst(Vertix vertix) {
        Set<Vertix> seenBefore = new HashSet<>();
        Queue<Vertix> traversalQueue = new LinkedList<>();
        List<Vertix> result = new LinkedList<>();

        traversalQueue.add(vertix);
        seenBefore.add(vertix);

        while (!traversalQueue.isEmpty()) {
            Vertix currentVertix = traversalQueue.remove();

            for(Edge edge: currentVertix.connectingEdges) {
                if(!seenBefore.contains(edge.connectingVertix)) {
                    seenBefore.add(edge.connectingVertix);
                    traversalQueue.add(edge.connectingVertix);
                }
            }
            result.add(currentVertix);
        }
        return result;
    }

}
