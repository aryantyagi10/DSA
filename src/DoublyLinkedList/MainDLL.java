package DoublyLinkedList;

public class MainDLL {
    public static void main(String[] args) {

            DoublyLinkedList myDLL = new DoublyLinkedList(1);

            myDLL.append(2);
          //myDLL.removeLast();
            myDLL.prepend(3);
           // myDLL.removeFirst();

        System.out.println(myDLL.get(1).value);

            myDLL.getHead();
            myDLL.getTail();
            myDLL.getLength();

            myDLL.printList();
    }
}
