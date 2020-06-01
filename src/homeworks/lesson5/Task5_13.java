package homeworks.lesson5;

import homeworks.lesson4.Task4_3;

public class Task5_13 {
    // TAsk 5.13 initialize an array [10] with random numbers
    // write a function that takes as an argument an array and returns the array sorted in desc order
    // print

    public static void main(String[] args) {
        int[] array = new int[10];
        int[] randomArray = Task5_11.initializeArrayWithRandomNumbers(array);
        Task5_11.printArray(Task4_3.sortArrayInDescendingOrder(randomArray));
    }
}
