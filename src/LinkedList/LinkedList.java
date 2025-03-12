package LinkedList;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    //Adding an item to the end

    public void append(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    //To Remove an item form the end
    public Node removeLast(){
        if(length == 0) return null;

        Node temp = head;
        Node pre = head;

        while (temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if(length == 0){
            head = null;
            tail = null;
        }
        return temp;
    }

    //Add Item to first
    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    //Remove Item from the first
    public Node removeFirst(){
        if(length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if(length == 0){
            tail = null;
        }
        return temp;
    }

    //To get an item at an index
    public Node get(int index){
        if(index < 0 || index >= length){
            return null;
        }
        Node temp = head;
        for(int i=0; i< index; i++){
            temp = temp.next;
        }
        return temp;
    }

    //To set a node at a particular Index
    public boolean set(int index, int value){
        Node temp = get(index);
        if(temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }

    //Insert a new Node at a particular index
    public boolean insert(int index, int value){
        if(index<0 || index > length) return false;

        if(index == 0){
            prepend(value);
            return true;
        }
        if(index == length){
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = head;
        Node pre = head;
        for(int i=0; i<index; i++){
            pre = temp;
            temp = temp.next;
        }

        pre.next = newNode;
        newNode.next = temp;
        length++;
        return true;

        /*
             Second Way
        Node newNode = new Node(value);
        Node temp = get(index-1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;

         */
    }


    //To remove an item from a particular index
    public Node remove(int index){
        if(index < 0 || index >= length) return null;

        if(index == 0) return removeFirst();

        if(index == length -1) return removeLast();

        Node temp = head;
        Node pre = head;

        for(int i=0; i<index; i++){
            pre = temp;
            temp = temp.next;
        }

        pre.next = temp.next;
        temp.next = null;
        length--;

        return temp;
    }

    //Reverse a linkedList
    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;

        for(int i=0; i<length; i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }




    //To print a Linked List
    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead(){
        System.out.println("Head: " +  head.value);
    }

    public void getTail(){
        System.out.println("Tail: " + tail.value);
    }

    public void getLength(){
        System.out.println("Length: " + length);
    }

}
