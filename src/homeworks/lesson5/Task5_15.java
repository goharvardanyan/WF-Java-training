package homeworks.lesson5;

import homeworks.lesson4.Task4_2;

public class Task5_15 {
    // Task 5.15 initialize an array [10] with random numbers
    // write a function that takes as an argument an array and returns the reversed array
    // print

    public static void main(String[] args) {
        int[] array = new int[10];
        Task5_11.initializeArrayWithRandomNumbers(array);
        Task5_11.printArray(array);
        int[] reversedArray = reverseArray(array);
        Task5_11.printArray(reversedArray);
    }

    public static int[] reverseArray(int[] array) {
        int lastIndex = array.length - 1;
        for (int i = 0; i < array.length / 2; i++) {
            Task4_2.swap(array, i, lastIndex - i);
        }
        return array;
    }
}
