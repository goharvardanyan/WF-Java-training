package homeworks.lesson4;

import java.util.Scanner;

public class Task4_6 {
    public static void main(String[] args) {
        int[][] matrix = Task4_5.initializeRandomMatrix(10, 15);
        Task4_5.printMatrix(matrix);
        int rowNumber = askRowNumberOfMatrix(matrix.length);
        int sumOfElementsInRow = sumOfElementsInRow(matrix, rowNumber);
        System.out.println(sumOfElementsInRow);
    }

    // 4.6 Create matrix with dimensions 10x15 initialize with random ints in range 10 - 99 print it
    // Get the row number from console. Print the sum of the elements in that row of the matrix.

    public static int sumOfElementsInRow(int[][] matrix,int rowNumber) {
        int sum = 0;
        for (int i = 0; i < matrix[rowNumber - 1].length; i++) {
            sum = sum + matrix[rowNumber - 1][i];
        }
        return sum;
    }

    public static int askRowNumberOfMatrix(int maximumNumber) {
        System.out.println("Please input row number in range 1 - " + maximumNumber);
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while(number < 1 || number > maximumNumber) {
            System.out.println("Wrong input.\n" +
                    "Please input row number in range 1 - " + maximumNumber);
            number = scanner.nextInt();
        }
        return number;
    }
}
