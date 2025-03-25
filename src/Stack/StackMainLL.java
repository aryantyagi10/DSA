package Stack;

public class StackMainLL {
    public static void main(String[] args) {
        StackUsingLL myStack = new StackUsingLL(2);

        myStack.push(1);
        myStack.push(3);
        System.out.println(myStack.pop().value);

        myStack.getTop();
        myStack.getHeight();

        myStack.printStack();
    }
}
