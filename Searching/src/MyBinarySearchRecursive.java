public class MyBinarySearchRecursive {

    //Caution: This works just on SORTED LISTS.
    // There are 2 ways; recursive implementation and iterative

    public static int binarySearchRecursive(int[] array, int data){
        return binarySearchRecursive(array, data, 0, array.length - 1);
    }

    public static int binarySearchRecursive(int[] array, int data, int leftIndex, int rightIndex){
        if (rightIndex < leftIndex) return -1;
        int middle = (leftIndex + rightIndex) / 2;
        if(array[middle] == data) return middle;
        if(data < array[middle]) return binarySearchRecursive(array, data, leftIndex, middle - 1);
        return binarySearchRecursive(array, data, middle + 1, rightIndex);
    }
}
