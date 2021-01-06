import java.util.Arrays;

public class SortingMainApp {
    public static void main(String[] args) {

        var myarray1 = new int[]{8, 2, 4, 1, 3, 0, -1};

        //Compare adjacent elements in index i & i + 1
        //Big-O Complexity : Best:O(n)(Linear) & Worst:O(n^2)(Quadratic)
        MyBubbleSort myBubbleSort = new MyBubbleSort();
        System.out.println(Arrays.toString(myBubbleSort.bubbleSort(myarray1)));
        System.out.println(Arrays.toString(myarray1));

        var myarray2 = new int[]{8, 2, 4, 1, 3, 0, -1};

        //Compare the first with the others, find the least, insert it to the first index, do the same to each index in order
        //Big-O Complexity : Best:O(n^2)(Quadratic) & Worst:O(n^2)(Quadratic)
        MySelectionSort mySelectionSort = new MySelectionSort();
        System.out.println(Arrays.toString(mySelectionSort.selectionSort(myarray2)));

        var myarray3 = new int[]{8, 2, 4, 1, 3, 0, -1};

        //Like ordering game carts one by by.
        //Take the first, compare it with the next, insert where it belongs, do the same one by one.
        //Big-O Complexity : Best:O(n)(Linear) & Worst:O(n^2)(Quadratic)
        MyInsertionSort myInsertionSort = new MyInsertionSort();
        System.out.println(Arrays.toString(myInsertionSort.insertionSort(myarray3)));
        System.out.println(Arrays.toString(myarray3));

        var myarray4 = new int[]{8, 2, 4, 1, 3, 0, -1};

        //Divide the array from the mid point (you will get left and right arrays) and continue dividing until you get
        //      an array for each item, and merge bottom to top until you get. Lastly compare he next item of left and
        //      right arrays and, merge them in order.
        //This type is one of the best sorting algorithms since its complexity is O(n) for best and worst scenarios.
        //Big-O Complexity : Best:O(n)(Linear) & Worst:O(n)(Linear)
        MyMergeSort myMergeSort = new MyMergeSort();
        myMergeSort.mergeSort(myarray4);
        System.out.println(Arrays.toString(myarray4));

        var myarray5 = new int[]{8, 2, 4, 1, 3, 0, -1};

        //Select the last element as pivot, put smaller elements to left of it, and bigger ones to right.
        //Then select the last element of the last partition, do the same until there is one element left.
        //Do the same for right partition.
        //Big-O Complexity : Best:O(n logn)(Logaritmic) & Worst:O(n^2)(Quadratic)
        MyQuickSort myQuickSort = new MyQuickSort();
        myQuickSort.sort(myarray5);
        System.out.println(Arrays.toString(myarray5));




//        var quickSort = new MyQuickSort();
//        quickSort.sort(myarray);
//        System.out.println(Arrays.toString(myarray));
//        //var myMergeSort=new MyMergeSort();
//        // myMergeSort.mergeSort(myarray);
//        //System.out.println(Arrays.toString(myarray));

    }

}
