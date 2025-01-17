package src.java.com.arrays;

public class SearchIn2DArray {
    public static boolean searchElement(int[][] matrix, int target) {
        int n = matrix.length; // Size of the matrix (n x n)
        
        int left = 0;
        int right = n * n - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int row = mid / n; // Calculate the row index
            int col = mid % n; // Calculate the column index
            int midValue = matrix[row][col];
            
            if (midValue == target) {
                return true; // Element found
            } else if (midValue < target) {
                left = mid + 1; // Search the right half
            } else {
                right = mid - 1; // Search the left half
            }
        }
        
        return false; // Element not found
    }
    
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5},
            {7, 9, 11},
            {13, 15, 17}
        };
        int target = 9;
        System.out.println("Is target " + target + " found? " + searchElement(matrix, target));
        
        target = 10;
        System.out.println("Is target " + target + " found? " + searchElement(matrix, target));
    }
}
