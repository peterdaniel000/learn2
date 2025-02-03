package queue;

import java.util.Set;
import java.util.HashSet;

public class Setimpl {
    public static void main(String[] args){
        Set<String>set = new HashSet<>(Set.of("Apple", "two", "quit"));
        System.out.println(set);

        set.add("Apple");
        set.add("mushroom");
        set.add("orange");

        System.out.println(set);
        
        set.contains("Apple");
        System.out.println(set.contains("Apple"));
        System.out.println(set.size());
        set.clear();
        System.out.println(set);


    }
    
}
