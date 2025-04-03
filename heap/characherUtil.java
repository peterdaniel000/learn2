package heap;

import java.util.HashMap;

public class characherUtil {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
    int left = 0, right = 0;
    HashMap<Character, Integer> charToFreq = new HashMap<>();
    int max = 0;

    while(right < s.length()){
            Character rightCharacter = s.charAt(right);
            charToFreq.put(rightCharacter, charToFreq.getOrDefault(rightCharacter,0) + 1);

            while(charToFreq.size() > k){
                Character leftCharacter = s.charAt(left);
                charToFreq.put(leftCharacter, charToFreq.get(leftCharacter) - 1);

                if (charToFreq.get(leftCharacter) == 0){
                    charToFreq.remove(leftCharacter);
                }

                left++;
            }
            max = Math.max(max, right - left + 1);
            right++;
        }
        return max;
    
    }


    public static void main(String[] args) {
        characherUtil util = new characherUtil();
        System.out.println(util.lengthOfLongestSubstringKDistinct("eceba", 2)); // Output: 3
        System.out.println(util.lengthOfLongestSubstringKDistinct("aa", 1));    // Output: 2
        System.out.println(util.lengthOfLongestSubstringKDistinct("", 2));     // Output: 0
        System.out.println(util.lengthOfLongestSubstringKDistinct("abcdef", 3)); // Output: 3
    }
}
