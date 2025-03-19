package DoublyLinkedList;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;
        Node prev;

        Node(int value){
            this.value = value;
        }
    }

    public DoublyLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    //Adding an item to an end
    public void append(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;

        length++;
    }

    //Remove an item from the last
    public Node removeLast(){
        if(length == 0) return null;

        Node temp = tail;
        tail = temp.prev;
        tail.next = null;
        temp.prev = null;
        length--;
        if(length == 0){
            head = null;
            tail = null;
        }
        return temp;
    }

    //Add an item to first
    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        length++;
    }

    //Remove First
    public Node removeFirst(){
        if(length == 0) return null;

        Node temp = head;
        head = head.next;
        head.prev = null;
        temp.next = null;
        length--;
        if(length == 0){
            head = null;
            tail = null;
        }

        return temp;
    }

    //Get a Node at a particular index
    public Node get(int index){
        if(index < 0 || index >= length) return null;

        Node temp = head;
        if(index < length/2){
            for(int i=0; i<index; i++){
                temp = temp.next;
            }
        } else {
            temp = tail;
            for(int i=length-1; i> index; i--){
                temp = temp.prev;
            }
        }

        return temp;
    }

    //Set a node at particular Node
    public boolean set(int index, int value){
        Node temp = get(index);
        if(temp != null){
            temp.value = value;
            return true;
        }

        return false;
    }

    //Insert a node at a particular Index
    public boolean insert(int index, int value){
        if (index < 0 || index > length) return false;

        if(index == 0){
            prepend(value);
            return true;
        }
        if(index == length){
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node before = get(index - 1);
        Node after = before.next;

        newNode.prev = before;
        newNode.next = after;
        before.next = newNode;
        after.prev = newNode;

        length++;
        return true;
    }

    //Remove a Node from an index
    public Node remove(int index){
        if(index < 0 || index >= length) return null;
        if(index == 0) return removeFirst();
        if(index == length-1) return removeLast();

        Node temp = get(index);
        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
        temp.prev = null;
        temp.next = null;

        length--;

        return temp;
    }

    //print DoublyLinked List
    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead(){
        System.out.println("Head: " + head.value);
    }

    public void getTail(){
        System.out.println("Tail: " + tail.value);
    }

    public void getLength(){
        System.out.println("Length: " + length);
    }

}
