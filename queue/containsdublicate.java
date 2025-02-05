package queue;

import java.util.Set;
import java.util.HashSet;

public class containsdublicate {
    public boolean containdublicate(int[] num){
        Set<Integer>seen = new HashSet<>();

        for(int nums: num){
            if (seen.contains(nums)){
                return true;
            }
            seen.add(nums);
        }
        return false;
    }
    
}
