import java.util.NoSuchElementException;

public class CyLinkedList {

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

    public CyLinkedList() {
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

    public void deleteLast() {
        if (isEmpty()) throw new NoSuchElementException();
        System.out.println("Deleting an item from the last: ");
        if (first == last) first = last = null;
        else {
            var previous = first;
            var current = first;
            while (current.next != null) {
                previous = current;
                current = current.next;
            }
            previous.next = null;
            last = previous;
        }
        size--;
    }

    public void printLinkedList() {
        if (isEmpty()) throw new NoSuchElementException();
        var current = first;
        while (current != null) {
            System.out.println("Value : " + current.value);
            current = current.next;
        }
    }
}
