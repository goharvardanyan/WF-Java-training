package homeworks.lesson5;

import java.util.Random;

public class Task5_11 {
    // Task 5.11 Create int array [10]
    // write a function that takes as a parameter array and initializes that array with random numbers
    // write a function that takes as a parameter array and prints it
    // Call them in main.

    public static void main(String[] args) {
        int[] array = new int[10];
        printArray(initializeArrayWithRandomNumbers(array));
    }

    public static int[] initializeArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1]);
    }
}
