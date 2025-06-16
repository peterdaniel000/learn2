package javaAdvance;

import java.util.Stack;

public class validparenthess {
    private Character getMatchingBracket(Character closedBracket) {
        switch(closedBracket) {
            case ')':
            return '(';
            case ']':
            return '[';
            case '}':
            return '{';
        }
        return null;
    }

    public boolean isInvalid(String s) {
        Stack<Character> bracketStack = new Stack<>();
        for (Character bracket : s.toCharArray()) {
            switch(bracket) {
                case '(':
                case '[':
                case '{':
                bracketStack.push(bracket);
                break;
                case ')':
                case ']':
                case '}':
                    if (bracketStack.isEmpty()) {
                        return false;
                    }
                    Character topBracket = bracketStack.pop();
                    if (topBracket != getMatchingBracket(bracket)) {
                        return false;
                    }
            }
        }
        return bracketStack.isEmpty();
    }
    
}
