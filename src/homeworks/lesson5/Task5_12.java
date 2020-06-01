package homeworks.lesson5;

import homeworks.lesson4.Task4_2;

public class Task5_12 {
    // Task 5.12 initialize an array [10] with random numbers
    // write a function that takes as an argument an array and returns the array sorted in asc order
    // print

    public static void main(String[] args) {
        int[] array = new int[10];
        int[] randomArray = Task5_11.initializeArrayWithRandomNumbers(array);
        Task5_11.printArray(Task4_2.sortArrayInAscendingOrder(randomArray));
    }
}
