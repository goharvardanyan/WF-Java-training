package homeworks.lesson4;

import java.util.Scanner;

public class Task4_10 {
    public static void main(String[] args) {
        int[][] matrix = Task4_5.initializeRandomMatrix(5, 5);
        Task4_5.printMatrix(matrix);
        displayMenu(matrix);


    }

    // Create matrix with dimensions 5x5 initialize with random ints in range 10 - 99
    // print it. Display a menu

    public static void displayMenu(int[][] matrix) {
        System.out.println("———————- MENU —————- \n" +
                "1. For rotating 90* \n" +
                "2. For rotating 180* \n" +
                "3. For rotating 270* \n" +
                "4. For Exit \n");
        Scanner scanner = new Scanner(System.in);
        int[][] rotatedMatrix;
        int number = scanner.nextInt();
        while (true) {
            if(number == 1) {
                rotatedMatrix = Task4_7.rotateMatrix90(matrix);
                Task4_5.printMatrix(rotatedMatrix);
            }
            else if(number == 2) {
                rotatedMatrix = Task4_8.rotateMatrix180(matrix);
                Task4_5.printMatrix(rotatedMatrix);
            }
            else if(number == 3) {
                rotatedMatrix = Task4_9.rotateMatrix270(matrix);
                Task4_5.printMatrix(rotatedMatrix);
            }
            else if(number == 4) {
                return;
            }
            System.out.println("———————- MENU —————- \n" +
                    "1. For rotating 90* \n" +
                    "2. For rotating 180* \n" +
                    "3. For rotating 270* \n" +
                    "4. For Exit \n");
            number = scanner.nextInt();
        }
    }
}
