package src.java.com.arrays;

public class SortedRotatedArray {

    // Function to check if the array is sorted and rotated
    public static boolean isSortedAndRotated(int[] arr) {
        int count = 0;

        // Count the number of times the array is unsorted
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[(i + 1) % arr.length] ) {
                count++;
            }
        }
        
        // If the count is 1, it's sorted and rotated
        return count == 1 && arr[0] > arr[arr.length - 1];
    }

    public static void main(String[] args) {
        // Example 1: Sorted and rotated array
        int[] arr1 = {4, 5, 6, 1, 2, 3};
        System.out.println("Array 1 is sorted and rotated: " + isSortedAndRotated(arr1));
        
        // Example 2: Sorted but not rotated
       int[] arr2 = {1, 2, 3, 4, 5};
       System.out.println("Array 2 is sorted and rotated: " + isSortedAndRotated(arr2));
        
        // Example 3: Not sorted
        int[] arr3 = {3, 5, 1, 4, 2};
        System.out.println("Array 3 is sorted and rotated: " + isSortedAndRotated(arr3));
    }
}
