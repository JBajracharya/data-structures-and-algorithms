package code401challenges.getEdge;

import code401challenges.graph.Graph;
import code401challenges.graph.Vertix;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetEdgeTest {
    Graph graph = new Graph();
    Vertix pandoraVer = graph.addNode("pandora");
    Vertix metrovilleVer = graph.addNode("metroville");
    Vertix arendelleVer = graph.addNode("arendelle");
    Vertix monstropolisVer = graph.addNode("monstropolis");
    Vertix nabooVer = graph.addNode("naboo");
    Vertix narniaVer = graph.addNode("narnia");

    @Before
    public void init() {
        Graph graph = new Graph();
        Vertix pandoraVer = graph.addNode("pandora");
        Vertix metrovilleVer = graph.addNode("metroville");
        Vertix arendelleVer = graph.addNode("arendelle");
        Vertix monstropolisVer = graph.addNode("monstropolis");
        Vertix nabooVer = graph.addNode("naboo");
        Vertix narniaVer = graph.addNode("narnia");
    }


    @Test
    public void getEdges() {
        graph.addEdge(pandoraVer, metrovilleVer, 82);
        graph.addEdge(pandoraVer, arendelleVer, 150);
        graph.addEdge(metrovilleVer, narniaVer, 37);
        graph.addEdge(metrovilleVer, nabooVer, 26);
        graph.addEdge(metrovilleVer, monstropolisVer,105);
        graph.addEdge(metrovilleVer, metrovilleVer, 99);
        graph.addEdge(narniaVer, nabooVer, 250);
        graph.addEdge(nabooVer, monstropolisVer, 73);
        graph.addEdge(arendelleVer, monstropolisVer, 42);

        String[] route1 = { "pandora", "naboo"};
        String[] route2 = {"arendelle", "monstropolis", "naboo"};

        assertEquals("False, $0", GetEdge.getDirectFlight(graph, route1));
        assertEquals("True, 115", GetEdge.getDirectFlight(graph, route2));
    }
}