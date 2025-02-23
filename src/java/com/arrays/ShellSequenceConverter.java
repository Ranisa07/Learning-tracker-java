package src.java.com.arrays;
/** Sequence to Shell: Fill a 2D array by spirally inserting the elements of a 1D array (sequence) into "shells" or layers.
    Shell to Sequence: Extract the elements of a 2D array in a spiral order into a 1D array (sequence). */

import java.util.ArrayList;
import java.util.List;

public class ShellSequenceConverter {

    // Convert a sequence (1D array) to shell representation (2D array)
    public static int[][] sequenceToShell(int[] sequence, int rows, int cols) {
        int[][] shellArray = new int[rows][cols];
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;
        int index = 0;

        while (top <= bottom && left <= right) {
            // Top row
            for (int i = left; i <= right && index < sequence.length; i++) {
                shellArray[top][i] = sequence[index++];
            }
            top++;

            // Right column
            for (int i = top; i <= bottom && index < sequence.length; i++) {
                shellArray[i][right] = sequence[index++];
            }
            right--;

            // Bottom row
            for (int i = right; i >= left && index < sequence.length; i--) {
                shellArray[bottom][i] = sequence[index++];
            }
            bottom--;

            // Left column
            for (int i = bottom; i >= top && index < sequence.length; i--) {
                shellArray[i][left] = sequence[index++];
            }
            left++;
        }

        return shellArray;
    }

    // Convert a shell representation (2D array) to sequence (1D array)
    public static int[] shellToSequence(int[][] shellArray) {
        List<Integer> sequence = new ArrayList<>();
        int rows = shellArray.length;
        int cols = shellArray[0].length;
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;

        while (top <= bottom && left <= right) {
            // Top row
            for (int i = left; i <= right; i++) {
                sequence.add(shellArray[top][i]);
            }
            top++;

            // Right column
            for (int i = top; i <= bottom; i++) {
                sequence.add(shellArray[i][right]);
            }
            right--;

            // Bottom row
            for (int i = right; i >= left; i--) {
                sequence.add(shellArray[bottom][i]);
            }
            bottom--;

            // Left column
            for (int i = bottom; i >= top; i--) {
                sequence.add(shellArray[i][left]);
            }
            left++;
        }

        // Convert List to array
        return sequence.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        // Example: Sequence to Shell
        int[] sequence = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int rows = 3, cols = 3;
        int[][] shellArray = sequenceToShell(sequence, rows, cols);

        System.out.println("Shell Representation (2D Array):");
        for (int[] row : shellArray) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        // Example: Shell to Sequence
        int[] extractedSequence = shellToSequence(shellArray);

        System.out.println("\nExtracted Sequence (1D Array):");
        for (int val : extractedSequence) {
            System.out.print(val + " ");
        }
    }
}
/** Explanation
Sequence to Shell:
Use a series of loops to fill the "shells" (spiral layers) of a 2D array.
Start from the outermost layer and proceed inward, filling elements sequentially.

Shell to Sequence:
Traverse the 2D array in a spiral order to extract the elements into a 1D array.
Collect values row by row and column by column from the outermost layer inward.

Input/Output 
Input:

Sequence: {1, 2, 3, 4, 5, 6, 7, 8, 9}
Rows: 3
Columns: 3 */

