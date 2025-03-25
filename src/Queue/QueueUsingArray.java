package Queue;

public class QueueUsingArray {
    int maxSize = 10;
    int currSize = 0;
    int[] arr = new int[maxSize];
    int start = -1;
    int end = -1;

    void push(int x){
        if(currSize == 0){
            start = 0;
            end = 0;
        } else {
            end = (end + 1) % maxSize;
        }

        arr[end] = x;
        currSize = currSize+1;
    }

     int pop(){
        if(currSize == 0) return -1;

        int element = arr[start];

        if(currSize == 1){
            start = -1;
            end = -1;
        } else {
            start = (start + 1) % maxSize;
            currSize--;
        }
        return element;
    }

     int top(){
        if(currSize == 0) return -1;

        return arr[start];
     }

     int size(){
        return currSize;
     }
}
