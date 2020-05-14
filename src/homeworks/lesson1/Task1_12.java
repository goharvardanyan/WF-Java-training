package homeworks.lesson1;

import java.util.Scanner;

public class Task1_12 {
    public static void main(String[] args) {
        // Task 1.12 Write a program Check Whether Number is Even or Odd

        System.out.println("Please input a number");
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            System.out.println("Wrong input");
        } else {
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                System.out.println("Number is even");
            } else {
                System.out.println("Number is odd");
            }
        }
    }
}
