package queue;
import java.util.Stack;

public class queueUsingStack {
    private Stack<Integer> inStack;
    private Stack<Integer> outStack;

    public queueUsingStack() {
       inStack = new Stack<>();
       outStack = new Stack<>();
    }

public void push(int x) {
    inStack.push(x);
}

public int pop() {
    peek();
    return outStack.pop();
}

public int peek() {
    if (outStack.isEmpty()) {
        while (!inStack.isEmpty()) {
            outStack.push(inStack.pop());
        }
    }
    return outStack.peek();
}
public boolean empty() {
    return inStack.isEmpty() && outStack.isEmpty();
}
    
}
