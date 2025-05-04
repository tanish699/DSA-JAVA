// package Graphs;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    private HashMap<String, ArrayList<String>> AdjList = new HashMap<>();
    
    public boolean addVertex(String Vertex){
        if(AdjList.get(Vertex) == null){
            AdjList.put(Vertex, new ArrayList<String>());
            return true;
        }
        return false;
    }

    public void printGraph(){
        System.out.println(AdjList);
    }

    public boolean addEdge(String vertex1, String vertex2){
        if(AdjList.get(vertex1) != null && AdjList.get(vertex2) != null){
            AdjList.get(vertex1).add(vertex2);
            AdjList.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }

    public boolean removeEdge(String vertex1, String vertex2){
        if(AdjList.get(vertex1) != null && AdjList.get(vertex2) != null){
            AdjList.get(vertex1).remove(vertex2);
            AdjList.get(vertex2).remove(vertex1);
            return true;
        }
        return false;
    }

    public boolean removeVertex(String vertex){
        if(AdjList.get(vertex) == null) return false;
        for(String OtherVertex : AdjList.get(vertex)){
            AdjList.get(OtherVertex).remove(vertex);
        }
        AdjList.remove(vertex);
        return true;
    }


    public static void main(String[] args) {
        
    }
}
