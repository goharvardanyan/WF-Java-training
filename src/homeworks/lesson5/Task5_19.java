package homeworks.lesson5;

import homeworks.lesson4.Task4_5;

import java.util.Random;
import java.util.Scanner;

public class Task5_19 {
    // Task 5.19 Write function (takes a number N as input from console) creates N x N matrix
    // And initializes it with random numbers in range 27 - 78

    public static void main(String[] args) {
        int[][] matrix = initializeMatrixWithRandomNumbers();
        Task4_5.printMatrix(matrix);
    }

    public static int[][] initializeMatrixWithRandomNumbers() {
        System.out.println("Please input a number: n > 0 ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Random random = new Random();
        int[][] matrix = new int[number][number];
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                matrix[i][j] = random.nextInt(51) + 27;
            }
        }
        return matrix;
    }
}

