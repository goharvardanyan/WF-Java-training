package homeworks.lesson1;

import java.util.Scanner;

public class Task1_9 {
    public static void main(String[] args) {
        // Task 1.9 Write a Java program to get a number from the user
        // and print whether it is positive or negative.

        System.out.println("Please input a number");
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            System.out.println("Wrong input");
        } else {
            int number = scanner.nextInt();
            if (number > 0) {
                System.out.println("Number is positive");
            } else if (number < 0) {
                System.out.println("Number is negative");
            } else {
                System.out.println("Number is 0");
            }
        }
    }
}
