package javaAdvance;

import java.util.Stack;

public class stackExample {
    public static void main(String[] args){
        Stack<Integer>stack = new Stack<>();
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack);

        int poppedElement = stack.pop();
        System.out.println(poppedElement);

        int topElement = stack.peek();
        System.out.println(topElement);

        int position = stack.search(2);
        System.out.println(position);

    }
}
