package code401challenges.graph;

public class Edge<T> {
    Node<T> node;
    int weight;

    public Edge(Node<T> node, int weight) {
        this.node = node;
        this.weight = weight;

    }

}
