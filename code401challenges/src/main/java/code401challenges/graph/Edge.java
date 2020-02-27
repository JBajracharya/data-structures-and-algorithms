package code401challenges.graph;

public class Edge {
    int weight;
    Vertix connectingVertix;

    public Edge(int weight, Vertix connectingVertix) {
        this.weight = weight;
        this.connectingVertix = connectingVertix;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Vertix getConnectingVertix() {
        return connectingVertix;
    }

    public void setConnectingVertix(Vertix connectingVertix) {
        this.connectingVertix = connectingVertix;
    }
}
