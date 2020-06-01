package homeworks.lesson5;

import homeworks.lesson4.Task4_1;

public class Task5_4 {
    // Task 5.4 get 3 numbers from console
    // write a function to find the smallest number among three numbers.
    // print the smallest number

    public static void main(String[] args) {
        System.out.println("The smallest number is " + findTheSmallestOfThreeNumbers());
    }

    public static int findTheSmallestOfThreeNumbers() {
        int min = Task4_1.askNumberFromConsole();
        int number;
        for (int i = 1; i < 3; i++) {
            number = Task4_1.askNumberFromConsole();
            if (min > number) {
                min = number;
            }
        }
        return min;
    }
}
