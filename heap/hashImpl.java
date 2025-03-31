package heap;

import java.util.HashMap;

public class hashImpl {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();

        //Adding values
        scores.put("Alice", 95);
        scores.put("Bod", 85);
        scores.put("Charlie", 90);
        // Retrieving a key-value pair
        int aliceScores = scores.get("Alice");
        System.out.println("Alice's score: " + aliceScores);

        //Removing a key-value pair
        scores.remove("Bod");
        System.out.println("HashMap after removing Bod:" + scores);

        //Checking if a key is present
        if(scores.containsKey("Charlie")) {
            System.out.println("Charlie scores is present");
        }

        //Checking if a value is present
        if (scores.containsValue(90)) {
            System.out.println("score 90 is present");
        }

        //Getting the size of the HashMap
        int size = scores.size();
        System.out.println("the size of the HashMap is : " + size);

        //Adding a new key-value pair
        scores.put("David", 88);
        System.out.println("HashMap after adding a new key value: "+ scores);

        //Iterating over the HashMap
        for (String key: scores.keySet()){
            int value = scores.get(key);
            System.out.println(key + "s score:"+ value);
        }

        scores.clear();
        System.out.println("HashMap after clearing:" + scores);
    }
}
