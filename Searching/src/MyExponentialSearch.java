public class MyExponentialSearch {

    //Binary Search in exponential size(^2) amount of list. Search till index 1, than 2, than 4, than 8...
    //Caution: This works just on SORTED LISTS.

    public static int exponentialSearch(int[] array, int data) {
        int bound = 1;
        while (bound < array.length && array[bound] < data) bound *= 2;
        int left = bound / 2;
        int right = Math.min(bound, array.length - 1);
        return MyBinarySearchRecursive.binarySearchRecursive(array, data, left, right);

    }
}
