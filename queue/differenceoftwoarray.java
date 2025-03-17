package queue;

import java.util.*;

public class differenceoftwoarray {
    private List<Integer> getInFirstNotSecond(int[] nums1, int[] nums2){
        Set<Integer> num2Numbers = new HashSet<>();
        Set<Integer> num1Numbers = new HashSet<>();

        for (Integer num : nums2){
            num2Numbers.add(num);
        }

        for (Integer num : nums2){
            if(!num2Numbers.contains(num)){
                num1Numbers.add(num);
            }
        }

        return new ArrayList<>(num1Numbers);
    }

    public List<List<Integer>> finddifferences(int[] nums1, int[] nums2){
        return Arrays.asList (
            getInFirstNotSecond(nums1, nums2),
            getInFirstNotSecond(nums2,nums1)
        );

    }
    
}
