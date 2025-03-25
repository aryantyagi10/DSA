package Queue;

public class MainQueueStack {
    public static void main(String[] args) {

        QueueUsingStack myQueue = new QueueUsingStack();

        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        myQueue.push(4);

        System.out.println("Top: " + myQueue.peek());
        System.out.println("Size: " + myQueue.size());

        myQueue.pop();
        myQueue.pop();

        System.out.println("Top: " + myQueue.peek());
        System.out.println("Size: " + myQueue.size());

    }
}
