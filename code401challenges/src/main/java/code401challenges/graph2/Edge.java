package code401challenges.graph2;

public class Edge {
    int weight;
    Vertix connectingVertix;

    public Edge(int weight, Vertix connectingVertix) {
        this.weight = weight;
        this.connectingVertix = connectingVertix;
    }
}
