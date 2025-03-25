package Stack;

import java.util.Queue;

public class StackMainQueue {
    public static void main(String[] args) {

        StackUsingQueue myStack = new StackUsingQueue();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println("Size: " + myStack.size());
        myStack.pop();
        System.out.println("Size: " + myStack.size());

        System.out.println("Top: " + myStack.top());

    }
}
