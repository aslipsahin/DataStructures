package src;

public class LinkedListInsertInOrder {

    public class Node {

        public int value; //this is the value of node
        public Node next; //this is the pointer to the next node

        public Node(int value) {
            this.value = value;
        }
    }

    public Node first;
    public Node last;
    public int size;

    public LinkedListInsertInOrder() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void addLast(int item) {
        var node = new Node(item);
        System.out.println("New item is added: " + item);
        if (isEmpty()) first = last = node;
        else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public void printLinkedList() {
        if (isEmpty()) throw new IllegalStateException();
        var current = first;
        while (current != null) {
            System.out.println("Value : " + current.value);
            current = current.next;
        }
    }

    public void insertInOrder(int item) {
        var node = new Node(item);
        Node current;
        if (isEmpty()) first = last = node;
        else if (item <= first.value) {
            node.next = first;
            first = node;
        } else {
            current = first;
            while ((current.next != null) && (node.value >= current.next.value)) current = current.next;
            if (current.next == null) {
                current.next = node;
                last = node;
            } else {
                node.next = current.next;
                current.next = node;
            }
        }
        size++;
    }

}
