package code401challenges.graph2;

import java.util.LinkedList;
import java.util.List;

public class Vertix {
    String name;
    List<Edge> connectingEdges;

    public Vertix(String name) {
        this.name = name;
        this.connectingEdges = new LinkedList<>();
    }
}
