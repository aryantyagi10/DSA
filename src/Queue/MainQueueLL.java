package Queue;

public class MainQueueLL {
    public static void main(String[] args) {

        QueueUsingLL myQueue = new QueueUsingLL(1);

        myQueue.enqueue(2);
        myQueue.enqueue(3);

        myQueue.dequeue();

        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();

        myQueue.printQueue();
    }
}
