package src.java.com.arrays;
/**Row-Major Order
In row-major order, you iterate through each row and within each row, you iterate through all its columns.
 */
public class RowMajorColumnMajor {
        public static void main(String[] args) {
            int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
    
            System.out.println("Row-Major Order:");
            for (int i = 0; i < array.length; i++) { // iterate over rows
                for (int j = 0; j < array[i].length; j++) { // iterate over columns in the row
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();

            System.out.println("Column-Major Order:");
        for (int j = 0; j < array[0].length; j++) { // iterate over columns
            for (int i = 0; i < array.length; i++) { // iterate over rows in the column
                System.out.print(array[i][j] + " ");
            }
        }
        System.out.println();
        }
      
}
/** Column-Major Order
In column-major order, you iterate through each column and within each column, you iterate through all its rows. */
