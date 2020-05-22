package homeworks.lesson4;

import java.util.Random;

public class Task4_5 {
    public static void main(String[] args) {
        int[][] matrix = initializeRandomMatrix(10, 15);
        printMatrix(matrix);
        System.out.println(maximumValueInMatrix(matrix));

    }

    // 4.5 Create matrix with dimensions 10x15 initialize with random ints in range 10 - 99
    // print it find and print the maximum value

    public static int[][] initializeRandomMatrix(int length1, int length2) {
        Random random = new Random();
        int[][] matrix = new int[length1][length2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(89) + 10;
            }
        }
        return matrix;
    }


    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int maximumValueInMatrix(int[][] matrix) {
        int maximum = 0;
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (maximum < matrix[i][j]) {
                    maximum = matrix[i][j];
                }
            }
        }
        return maximum;
    }
}
