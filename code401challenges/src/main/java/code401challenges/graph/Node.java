package code401challenges.graph;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {
    T value;
    List<Edge<T>> edges;

    public Node(T value) {
        this.value = value;
        this.edges = new ArrayList<>();
    }

}
