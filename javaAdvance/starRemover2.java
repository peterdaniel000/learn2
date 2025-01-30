package javaAdvance;

import java.util.Stack;

public class starRemover2 {
    public String starRemover(String s){
        Stack<Character> charstack = new Stack<Character>();
        StringBuilder sb = new StringBuilder();

        for (Character c: s.toCharArray()){
            if (c == '*'){
                charstack.pop();
            }else {
                charstack.push(c);
            }
        }

        while (!charstack.isEmpty()){
            sb.append(charstack.pop());
        }
        return sb.reverse().toString();
    }
}
