package java;

public class Sum2DArray {
    public static void main(String[] args) {

        //sum of 2D array matrix elements

        int[][] matrix = {
            {1, 2, 3},  
            {4, 5, 6},
            {7, 8, 9}
        };

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
                sum += matrix[i][j];
            }
            System.out.println();
        }
        System.out.println("The sum of all elements in the matrix is: " + sum);
        
        //sum of 3D array matrix elements

         int[][][] matrix1={{               //3D Array Initialization
                             {1,2,3},
                             {4,5,6},
                             {7,8,8}
                            }};
        int sum1=0;
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix1[i].length;j++){
                for(int k=0;k<matrix1[i][j].length;k++){
                    System.out.println(matrix1[i][j][k]);
                     sum1+=matrix1[i][j][k];
                }
                System.out.println();
            }
        }
        System.out.println("The sum of all elements in the matrix1 is: " + sum1);  
        
    }
}
