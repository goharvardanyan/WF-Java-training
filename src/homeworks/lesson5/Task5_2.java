package homeworks.lesson5;

import java.util.Scanner;

public class Task5_2 {
    // Task 5.2 get 2 random numbers from console write a function to calculate their product
    // print the product

    public static void main(String[] args) {
        System.out.println(calculateProductOfTwoRandomNumbers());
    }

    public static int calculateProductOfTwoRandomNumbers() {
        System.out.println("Please input two random numbers ");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        return number1 * number2;
    }
}
