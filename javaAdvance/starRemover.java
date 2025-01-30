package javaAdvance;

import java.util.Stack;

public class starRemover {
    public String removeStars(String s ) {
        Stack<Character> charstack = new Stack<Character>();
        StringBuilder sb = new StringBuilder();

        for (Character c : s.toCharArray()){
            charstack.push(c);
        }

        int numStar = 0;
        while(!charstack.isEmpty()){
            if (charstack.peek() == '*'){
                numStar++;
                charstack.pop();
            } else {
                if (numStar > 0){
                    charstack.pop();
                    numStar--;
                } else {
                    sb.append(charstack);
                }
            }
        }
        return sb.reverse().toString();
    }
}
