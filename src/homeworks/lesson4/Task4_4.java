package homeworks.lesson4;

import java.util.Scanner;

public class Task4_4 {
    public static void main(String[] args) {
        int[] array = Task4_1.initializeRandomArray(10);
        Task4_1.printArray(array);
        int number = Task4_1.askNumberFromConsole();
        System.out.println(indexOfNumber(array,number));

    }

    //4.4 Create array with length 10 Initialize with random ints (10 - 99)
    //print it. Get a number from console find and print the index  of that number

    public static int indexOfNumber(int[] array,int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return -1;
    }
}
