package java;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySorting {
    public static void main(String[] args) {
        // Example array
        Integer[] numbers = {15, 12, 39, 41, 37};

        // Sort in ascending order using Comparator
        Arrays.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1%10 > o2%10){                     //sort array elements by its 1st digit
                return 1; // Ascending order 
                }
                else{
                    return -1;
                }
            }
        });

        // Print the sorted array
        System.out.println("Ascending Order: " + Arrays.toString(numbers));

        // Sort in descending order using Comparator
        Arrays.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1; // Descending order
            }
        });

        // Print the sorted array
        System.out.println("Descending Order: " + Arrays.toString(numbers));
    }
}
