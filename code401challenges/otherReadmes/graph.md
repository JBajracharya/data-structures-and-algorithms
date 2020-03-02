# Graphs
<!-- Short summary or background information -->
Implementing a graph that is bidirectional in nature. It stores the elements in the graph as vertices and 
each vertex can have list of edges that it is connected to. 


## Challenge
<!-- Description of the challenge -->
Vertex edges are implemented with the weight passed in by the user. 

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
graph stores the vertices in a hashset making it a constant time O(1) in addition and retrieval of vertex.
Space complexity of retrieval is also O(1) as no new space is created for retrieval.

## API
<!-- Description of each method publicly available in your Graph -->
addNode()     : takes in string as a parameter and adds a new vertex to the graph without any connection to the edges.
addEdge()     : takes origin vertex, destination vertex and integer weight as a parameter and 
                adds destination as edges to origin vertex
getNodes()    : gets all the vertices in the graph
getNeighbors(): takes in a vertex for parameter and gets all the edges of that vertex.
size()        : gets the total number of vertices in the graph
