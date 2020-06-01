package homeworks.lesson5;

import java.util.Scanner;

public class Task5_3 {
    //Task 5.3 get 2 numbers from console write a function to calculate their product
    // write a function to calculate cube of the product
    // print the cube of the product

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int product = calculateProductOfTwoNumbers(number1, number2);
        System.out.println(calculateCubeOfNumber(product));
    }

    public static int calculateProductOfTwoNumbers(int number1, int number2) {
        return number1 * number2;
    }

    public static double calculateCubeOfNumber(int number) {
        return Math.pow(number, 3);
    }
}
