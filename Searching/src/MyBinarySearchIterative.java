public class MyBinarySearchIterative {
    public int binSearchIterative(int[] array, int data) {
        int leftIndex = 0;
        int rightIndex = array.length - 1;
        while (leftIndex <= rightIndex) {
            int middle = (leftIndex + rightIndex) / 2;
            if (array[middle] == data) return middle;
            if (data < array[middle]) rightIndex = middle - 1;
            else leftIndex = middle + 1;
        }
        return -1;
    }
}
