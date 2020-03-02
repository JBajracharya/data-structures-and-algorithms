package code401challenges.graph;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GraphTest {
    Graph graph = new Graph();
    Vertix johnVert = graph.addNode("John");
    Vertix mikeVert = graph.addNode("Mike");
    Vertix jamesVert = graph.addNode("James");
    Vertix BillVert = graph.addNode("Bill");
    Vertix markVert = graph.addNode("Mark");
    Vertix daneVert = graph.addNode("Dane");

    @Before
    public void init() {
        graph.addEdge(johnVert, mikeVert, 10);
        graph.addEdge(johnVert, jamesVert, 5);
        graph.addEdge(mikeVert, BillVert, 20);
        graph.addEdge(mikeVert, markVert, 25);
        graph.addEdge(daneVert, BillVert, 15);
        graph.addEdge(daneVert, johnVert, 30);
    }

    @Test
    public void testAddNode() {
        assertTrue(graph.vertices.contains(mikeVert));
        assertTrue(graph.vertices.contains(jamesVert));
    }

    @Test
    public void testAddEdge() {
        assertEquals("Mike", johnVert.connectingEdges.get(0).connectingVertix.name);
        assertEquals("James", johnVert.connectingEdges.get(1).connectingVertix.name);
        assertEquals("Dane", johnVert.connectingEdges.get(2).connectingVertix.name);
    }

    @Test
    public void emptyGraph() {
        Graph emptyGraph = new Graph();
        assertNull(emptyGraph.getNodes());
    }

    @Test
    public void testEmptyEdges() {
        Graph noEdge = new Graph();
        Vertix vertix = noEdge.addNode("John");
        assertNull(noEdge.getNeighbors(vertix));
    }

    @Test
    public void testGetNodes() {
        int verticesCount = graph.getNodes().size();

        assertEquals(6, verticesCount);
        assertTrue(graph.getNodes().contains(johnVert));
    }

    @Test
    public void getNeighborsTest() {
        List<Edge> list = graph.getNeighbors(johnVert);
        StringBuilder actual = new StringBuilder();
        for (Edge e :
                list) {
           actual.append(e.connectingVertix.name + " ");
        }
//        System.out.println("e = " + actual);
        assertEquals("Mike James Dane ", actual.toString());
    }

    @Test
    public void testSize() {
        assertEquals(6, graph.size());
    }
    
    @Test
    public void testBreadthFirst(){
        List<Vertix> list = graph.breadthFirst(johnVert);
        StringBuilder actual = new StringBuilder();
        for (Vertix v :
                list) {
            actual.append(v.name + " ");
        }
        assertEquals("John Mike James Dane Bill Mark ", actual.toString());
    }

    @Test
    public void testDepthFirst() {
        List<Vertix> list = graph.depthFirst(johnVert);
        StringBuilder actual = new StringBuilder();
        for (Vertix v :
                list) {
            actual.append(v.name + " ");
        }

        assertEquals("John Dane Bill James Mike Mark ", actual.toString());
    }

}

