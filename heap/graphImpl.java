package heap;

import java.util.*;

public class graphImpl {
    private Map<Integer, List<Integer>> adjList;

    graphImpl (int v){
        adjList = new HashMap<>();

        for (int i = 0; i < v; ++i)
            adjList.put(i, new ArrayList<>());
        

    }

    void addEgde(int v, int w){
          adjList.get(v).add(w);
          adjList.get(w).add(v);  
    }

    void removeEgde(int v, int w){
        List<Integer> vList = adjList.get(v);
        List<Integer> wList = adjList.get(w);

        if(vList != null) vList.remove(Integer.valueOf(w));
        if(wList != null) wList.remove(Integer.valueOf(v));
    }

    void removeNode(int v){
        if (adjList.containsKey(v)) {
            for (int neighbor : adjList.get(v)) {
                adjList.get(neighbor).remove(Integer.valueOf(v));
            }
        }
        adjList.remove(v);
    }
    
}
