package homeworks.lesson4;

import java.util.Random;
import java.util.Scanner;

public class Task4_1 {
    public static void main(String[] args) {

        int[] array = initializeRandomArray(10);
        printArray(array);
        int number = askNumberFromConsole();
        System.out.println(containNumber(array, number));

    }

    // 4.1 Create array with length 10 Initialize with random ints (10 - 99)
    // print it get a number from consol test if an array contains that number

    public static int[] initializeRandomArray(int length) {
        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(89) + 10;
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length - 1]);
        System.out.println();
    }


    public static boolean containNumber(int[] array,int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }

    public static int askNumberFromConsole() {
        System.out.println("Please input a number ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
