package homeworks.lesson5;

import java.util.Random;

public class Task5_1 {
    // Task 5.1 generate 2 random numbers write a function to calculate their sum
    // print the sum

    public static void main(String[] args) {
        System.out.println(calculateSumOfTwoRandomNumbers());
    }

    public static int calculateSumOfTwoRandomNumbers() {
        Random random = new Random();
        int number1 = random.nextInt();
        int number2 = random.nextInt();
        return number1 + number2;
    }
}
