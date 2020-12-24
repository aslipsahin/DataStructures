package src;

public class LinkedListApp {
    public static void main(String[] args) {

//        ======= practice cyLinkedList addLast method =======

        var cyLinkedList = new CyLinkedList();
        for (int j = 1; j <= 11; j++) cyLinkedList.addLast(j);

        System.out.println("Initial Linked List");
        cyLinkedList.printLinkedList();

//        ======= practice cyLinkedList reverse method =======

        System.out.println("Linked list after reverse in one pass");
        cyLinkedList.reverse();
        cyLinkedList.printLinkedList();

//        ======= practice cyLinkedList getKthFromTheEnd method =======

        System.out.println(cyLinkedList.getKthFromTheEnd(5));
        cyLinkedList.printMiddle();

//        ======= practice LinkedListInsertInOrder =======

        System.out.println("linkedListInsertInOrder");

        var linkedListInsertInOrder = new LinkedListInsertInOrder();
        for (int i = 0; i <= 10; i++) linkedListInsertInOrder.addLast(i);
        linkedListInsertInOrder.printLinkedList();
        System.out.println(linkedListInsertInOrder.size);
        linkedListInsertInOrder.insertInOrder(5);
        linkedListInsertInOrder.printLinkedList();
        System.out.println(linkedListInsertInOrder.size);
    }
}
