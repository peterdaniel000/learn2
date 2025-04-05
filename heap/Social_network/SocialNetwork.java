package heap.Social_network;

import java.util.List;
import java.util.Map;

public class SocialNetwork extends Graph{
    
    SocialNetwork(int v) {
        super(v);
    }

    void addFriendship(String user1, String user2){
        addEgde(user1, user2);
    }

    void displaySocialNetwork(){
        System.out.println("Social Network Connections");
        for(Map.Entry<String, List<String>> entry: adjList.entrySet()){
            String user = entry.getKey();
            List<String> friends = entry.getValue();
            System.out.println(user + " is friend with : "+ friends);
        }
    }

    public static void main(String[] args){
       SocialNetwork socialNetwork = new SocialNetwork(100);

       socialNetwork.addFriendship("Alice", "Bob");
       socialNetwork.addFriendship("Alice", "Charlie");
       socialNetwork.addFriendship("Bob", "David");
       socialNetwork.addFriendship("Charlie", "Eve");

       socialNetwork.displaySocialNetwork();
        
    }
    
}
