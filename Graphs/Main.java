// package Graphs;

public class Main {
    public static void main(String[] args) {
        Graph myGraph = new Graph();

        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        myGraph.addEdge("A", "B");
        myGraph.addEdge("B", "C");
        myGraph.addEdge("C", "A");
        myGraph.addVertex("D");
        myGraph.addEdge("D", "A");
        myGraph.addEdge("D", "B");
        myGraph.addEdge("D", "C");  
        // myGraph.removeEdge("C", "A");

        myGraph.printGraph();
        myGraph.removeVertex("D");
        myGraph.printGraph();
    }
    
}
