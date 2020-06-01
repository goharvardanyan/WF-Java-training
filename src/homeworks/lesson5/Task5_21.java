package homeworks.lesson5;

import homeworks.lesson4.Task4_5;
import homeworks.lesson4.Task4_7;
import homeworks.lesson4.Task4_8;
import homeworks.lesson4.Task4_9;

import java.util.Scanner;

public class Task5_21 {
    // Task 5.21 Write a function (takes a number N as input from console) creates N x N matrix
    // And initializes it with random numbers in range 27 - 78
    // print it
    // Display a menu

    public static void main(String[] args) {
        int[][] matrix = Task5_19.initializeMatrixWithRandomNumbers();
        Task4_5.printMatrix(matrix);
        displayMenu(matrix);
    }

    public static void displayMenu(int[][] matrix) {
        System.out.println("------------------MENU-------------\n" +
                "Press 1 For rotating 90*\n" +
                "Press 1 For rotating 180*\n" +
                "Press 1 For rotating 270*\n" +
                "Press 4 To EXIT\n" +
                "-----------------------------------");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int[][] rotatedArray;
        while (inputNumber != 4) {
            switch (inputNumber) {
                case 1:
                    rotatedArray = Task4_7.rotateMatrix90(matrix);
                    Task4_5.printMatrix(rotatedArray);
                    break;
                case 2:
                    rotatedArray = Task4_8.rotateMatrix180(matrix);
                    Task4_5.printMatrix(rotatedArray);
                    break;
                case 3:
                    rotatedArray = Task4_9.rotateMatrix270(matrix);
                    Task4_5.printMatrix(rotatedArray);
                    break;
                default:
                    System.out.println("Wrong Input");
            }
            System.out.println("------------------MENU-------------\n" +
                    "Press 1 For rotating 90*\n" +
                    "Press 1 For rotating 180*\n" +
                    "Press 1 For rotating 270*\n" +
                    "Press 4 To EXIT\n" +
                    "-----------------------------------");
            inputNumber = scanner.nextInt();
        }
    }
}
