package LinkedList;

public class MainLL {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
       myLinkedList.append(2);
       myLinkedList.append(3);
       myLinkedList.append(4);
      //  System.out.println(myLinkedList.removeFirst().value);
        System.out.println(myLinkedList.get(3).value + "\n");
       // myLinkedList.set(2, 10);
        myLinkedList.insert(1, 20);
        myLinkedList.remove(3);

        myLinkedList.reverse();

//        System.out.println(myLinkedList.removeLast().value);
//        System.out.println(myLinkedList.removeLast().value);
//        System.out.println(myLinkedList.removeLast());



        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        myLinkedList.printList();
    }
}
