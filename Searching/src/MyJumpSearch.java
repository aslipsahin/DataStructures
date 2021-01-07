public class MyJumpSearch {

    //Caution: This works just on SORTED LISTS.
    //Divide the array into blocks, block size is square root of size.
    //Compare data with the last element of the first block, and than move to the next block...

    public static int jumpSearch(int[] array, int data) {
        int blockSize = (int) Math.sqrt(array.length);
        int start = 0;
        int next = blockSize;
        while (start < array.length && array[next - 1] < data) {
            start = next;
            next += blockSize;
            if (next > array.length) next = array.length;
        }
        for (int i = start; i < next; i++) {
            if (array[i] == data) return i;
        }
        return -1;
    }
}
