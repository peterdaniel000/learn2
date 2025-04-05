package heap.Social_network;

import java.util.*;

public class Graph {
    protected Map<String, List<String>> adjList;

    public Graph(int v) {
        adjList = new HashMap<>();
    }

    void addEgde(String v, String w) {
        adjList.computeIfAbsent(v, k -> new ArrayList<>()).add(w);
        adjList.computeIfAbsent(w, k -> new ArrayList<>()).add(v);
    }
}
