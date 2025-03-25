package Stack;

public class StackMainArray {
    public static void main(String[] args) {

        StackUsingArray stack = new StackUsingArray();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop();
        System.out.println(stack.top());
        System.out.println(stack.size());

    }
}
