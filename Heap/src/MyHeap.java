public class MyHeap {
    private final int[] heap = new int[20];
    private int size;

    public int parent(int index) {
        return (index - 1) / 2;
    }

    public boolean isFull() {
        return size == heap.length;
    }

    public void insert(int value) {
        if (isFull()) throw new IllegalStateException();
        heap[size++] = value;
        bubbleUp();
    }

    public void bubbleUp() {
//        let's say the last item's index is index
        int index = size - 1;
        while (index > 0 && heap[index] > heap[parent(index)]) {
            swap(index, parent(index));
            index = parent(index);
        }
    }

    private void swap(int first, int second) {
        int temp = heap[first];
        heap[first] = heap[second];
        heap[second] = temp;
    }

    public void print() {
        for (int i = 0; i < size; i++) System.out.print(heap[i] + ", ");
    }

}
