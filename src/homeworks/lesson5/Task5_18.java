package homeworks.lesson5;

import java.util.Random;
import java.util.Scanner;

public class Task5_18 {
    // Task 5.18 Write function (takes a number n as input from console) to displays
    // an n-by-n matrix. Initialized randomly by ‘+’ or ‘-’

    public static void main(String[] args) {
        char[][] matrix = initializeMatrixRandomlyByPlusMinus();
        printMatrix(matrix);
    }

    public static char[][] initializeMatrixRandomlyByPlusMinus() {
        System.out.println("Please input a number: n > 0 ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Random random = new Random();
        char[][] matrix = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (random.nextInt(2) == 0) {
                    matrix[i][j] = '+';
                } else {
                    matrix[i][j] = '-';
                }
            }
        }
        return matrix;
    }

    public static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
