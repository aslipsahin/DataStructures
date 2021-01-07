public class SearchMainApp {
    public static void main(String[] args) {
        int[] myarray = new int[]{1, 2, 3, 4, 5, 6, 89, 100, 110, 111, 112};
        var mylinearsearch = new MyLinearSearch();

        System.out.println("Linear Search : " + mylinearsearch.linearSearch(myarray, 112));
        var mybinarysearchrec = new MyBinarySearchRecursive();
        System.out.println("Rec Bin Search : " + mybinarysearchrec.binarySearchRecursive(myarray, 112));
        var mybinarysearchite = new MyBinarySearchIterative();
        System.out.println("Ite Bin Search : " + mybinarysearchite.binSearchIterative(myarray, 112));
        var myternarysearch = new MyTernarySearch();
        System.out.println("Ternary Search : " + myternarysearch.ternarySearch(myarray, 112));

    /*

    Linear (Sequential) Search : Time Complexity; Best:O(1)  Worst:O(n)
    Binary Search: Time Complexity: O(log n) , Space Complexity: Recursive -> O(log n) , Iterative -> O(1)
    Binary search is faster than ternary
    Jump Search: Time Complexity: O(root n)
    Exponential Search: Time Complexity: O(log n)
     */
    }
}
