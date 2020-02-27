package code401challenges.graph;

import java.util.LinkedList;
import java.util.List;

public class Vertix {
    String name;
    List<Edge> connectingEdges;

    public Vertix(String name) {
        this.name = name;
        this.connectingEdges = new LinkedList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Edge> getConnectingEdges() {
        return connectingEdges;
    }

    public void setConnectingEdges(List<Edge> connectingEdges) {
        this.connectingEdges = connectingEdges;
    }
}
