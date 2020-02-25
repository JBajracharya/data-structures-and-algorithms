package code401challenges.graph;

import org.junit.Test;

import static org.junit.Assert.*;

public class GraphTest {

    @Test
    public void addNode() {
        Graph<Integer> graph = new Graph<>();

        Node<Integer> node = new Node<>(10);

        graph.addNode(node);

        assertEquals("[10]", graph.getNodes().toString());
    }

    @Test
    public void testAddEdge() {
        Graph<String> graph1 = new Graph<>();

        Node<String> node1 = new Node<>("John");
        Node<String> node2 = new Node<>("Mike");
        Node<String> node3 = new Node<>("Ron");
        Node<String> node4 = new Node<>("Bell");
        Node<String> node5 = new Node<>("Ash");
        Node<String> node6 = new Node<>("Jay");

        graph1.addNode(node1);
        graph1.addNode(node2);
        graph1.addNode(node3);
        graph1.addNode(node4);
        graph1.addNode(node5);
        graph1.addNode(node6);



        graph1.addEdge(node1, node2, true, 30);
        System.out.println("node1.value = " + node2.value);
        graph1.addEdge(node1, node3, true, 20);
        graph1.addEdge(node3, node4, true, 10);
        graph1.addEdge(node4, node5, true, 50);
        graph1.addEdge(node5, node6, true, 30);
        graph1.addEdge(node6, node4, true, 60);

//        String actual  = node1.edges.get(0).node.value;
//        assertEquals(1, actual);
    }
    
}