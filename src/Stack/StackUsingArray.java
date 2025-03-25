package Stack;

public class StackUsingArray {
    int size = 1000;
    int[] arr = new int[size];
    int top = -1;

    void push(int x){
        top = top + 1;
        arr[top] = x;
    }

    int pop() {
        if (top == -1) return -1;

        int x = arr[top];
        top = top - 1;
        return x;
    }
    int top(){
        return arr[top];
    }

    int size(){
        return top + 1;
    }

}
