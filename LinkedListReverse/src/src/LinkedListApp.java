package src;

public class LinkedListApp {
    public static void main(String[] args) {
        var cyLinkedList = new CyLinkedList();
        for (int j = 1; j <= 11; j++) cyLinkedList.addLast(j);


        System.out.println("Initial Linked List");
        cyLinkedList.printLinkedList();

        System.out.println("Linked list after reverse in one pass");
        cyLinkedList.reverse();
        cyLinkedList.printLinkedList();
        System.out.println(cyLinkedList.getKthFromTheEnd(5));
        cyLinkedList.printMiddle();

    }
}
