package Queue;

import java.util.Stack;

public class QueueUsingStack {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();


    void push(int x){
        while(s1.isEmpty() == false){
            s2.push(s1.pop());
        }

        s1.push(x);

        while (s2.isEmpty() == false){
            s1.push(s2.pop());
        }
    }


    int pop(){
        return s1.pop();
    }

    int peek(){
        return s1.peek();
    }


    int size(){
        return s1.size();
    }


    boolean empty(){
        return s1.isEmpty();
    }
}
