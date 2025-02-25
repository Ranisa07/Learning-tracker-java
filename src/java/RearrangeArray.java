package java;

import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {2, 4, 6, 8};
        int[] arr3 = {1, 3, 5, 7};
        int[] arr4 = {0, 1, 2, 3, 4, 5};
        
        // Process test cases
        System.out.println("Original: " + Arrays.toString(arr1));
        rearrangeOddEven(arr1);
        System.out.println("Rearranged: " + Arrays.toString(arr1));
        
        System.out.println("\nOriginal: " + Arrays.toString(arr2));
        rearrangeOddEven(arr2);
        System.out.println("Rearranged: " + Arrays.toString(arr2));
        
        System.out.println("\nOriginal: " + Arrays.toString(arr3));
        rearrangeOddEven(arr3);
        System.out.println("Rearranged: " + Arrays.toString(arr3));
        
        System.out.println("\nOriginal: " + Arrays.toString(arr4));
        rearrangeOddEven(arr4);
        System.out.println("Rearranged: " + Arrays.toString(arr4));
    }

    public static void rearrangeOddEven(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int index = 0;

        // Collect odd numbers
        for (int num : arr) {
            if (num % 2 != 0) {
                temp[index++] = num;
            }
        }

        // Collect even numbers
        for (int num : arr) {
            if (num % 2 == 0) {
                temp[index++] = num;
            }
        }

        // Copy back to original array
        System.arraycopy(temp, 0, arr, 0, n);
    }
}

/** Explanation:
1. Odd numbers are collected first, followed by even numbers.
2. The original order of odd and even numbers is maintained in the rearranged array.
3. The test cases demonstrate arrays with mixed values, only even values, only odd values, and arrays with zero. */