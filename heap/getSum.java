package heap;

import java.util.HashMap;

public class getSum {
    public int[] twoSum(int[] nums, int target){
            HashMap<Integer, Integer> numbersMap = new HashMap<>();
    
            for (int i = 0; i < nums.length; i++){
                numbersMap.put(nums[i], i);
            }
    
            for (int i = 0; i < nums.length; i++){
                int complement = target - nums[i];
                if (numbersMap.containsKey(complement) && numbersMap.get(complement) != i){
                    return new int[]{numbersMap.get(complement), i};
                }
            }
    
            return new int[]{};
        }
    
        public static void main(String[] args){
            getSum newSum = new getSum();
            int[] num = {5,6,7,8,9,10};
            int target = 15;
    
            int[] result = newSum.twoSum(num, target);

            if (result.length == 2) {
            System.out.println("["+ result[1] +"," + result[0] +"]");
            } else {
                System.out.println("solution not found");
            }
    }
}


