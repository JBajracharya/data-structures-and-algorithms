package code401challenges.graph;

import java.util.ArrayList;
import java.util.List;

public class Node {
    int value;
    List<Edge> list;

    public Node(int value, List<Edge> list) {
        this.value = value;
        this.list = new ArrayList<>();
    }

}
