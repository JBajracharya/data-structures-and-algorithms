package code401challenges.getEdge;

import code401challenges.graph.Edge;
import code401challenges.graph.Graph;
import code401challenges.graph.Vertix;

import java.util.Set;

public class GetEdge {
    public static String getDirectFlight(Graph routes, String[] cityNames) {
        Set<Vertix> allCities = routes.getNodes();
        int fare = 0;
        String result = "False, $0";
        if(allCities == null) {
            return result;
        }
        for(int i = 0; i < cityNames.length - 1; i++) {
            for (Vertix city :
                    allCities) {
                if(city.getName().equals(cityNames[i])) {
                    for(Edge edge : city.getConnectingEdges() ) {
                        if(edge.getConnectingVertix().getName().equals(cityNames[i+1])) {
                            fare += edge.getWeight();
                            result = "True, " + fare;
                        }
                    }
                }
            }
        }
        return result;
    }

}
