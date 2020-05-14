package homeworks.lesson1;

import java.util.Scanner;

public class Task1_4 {
    public static void main(String[] args) {
        // Task 1.4 Write a Java program that takes two numbers as input
        // from console and display the product of two numbers.

        System.out.println("Please input two numbers");
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            System.out.println("Wrong input");
        } else {
            int number1 = scanner.nextInt();
            if (!scanner.hasNextInt()) {
                System.out.println("Wrong input");
            } else {
                int number2 = scanner.nextInt();
                int product = number1 * number2;
                System.out.println(product);
            }
        }
    }
}
