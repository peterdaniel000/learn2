package heap;

import java.util.PriorityQueue;
import java.util.Set;
import java.util.HashSet;

public class thirdMax {
    public int thirdMaxi(int[] nums){

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Set<Integer> visited = new HashSet<>();

        for (int i = 0; i < nums.length; i++){
            if (visited.contains(nums[i])) continue;
            if (pq.size() == 3) {
                if (pq.peek() < nums[i]) {
                    visited.remove(pq.poll());
                    visited.add(nums[i]);
                }
            } else {
                visited.add(nums[i]);
                pq.add(nums[i]);
            }
        }
        if (pq.size() == 1) {
            return pq.peek();
        } else if (pq.size() == 2){
            pq.poll();
        }

        return pq.peek();
        
    }
}
