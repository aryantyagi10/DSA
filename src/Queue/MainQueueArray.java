package Queue;

public class MainQueueArray {
    public static void main(String[] args) {

        QueueUsingArray queue = new QueueUsingArray();

        queue.push(10);
        queue.push(20);
        queue.push(30);
        queue.pop();

        System.out.println(queue.top());
        System.out.println(queue.size());
    }
}
