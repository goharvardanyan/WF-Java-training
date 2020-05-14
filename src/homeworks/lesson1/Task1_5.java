package homeworks.lesson1;

import java.util.Scanner;

public class Task1_5 {
    public static void main(String[] args) {
        // Task 1.5 Write a Java program that takes a number as input
        // and prints its multiplication table upto 10.

        System.out.println("Please input a number");
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            System.out.println("Wrong input");
        }else {
            int number = scanner.nextInt();
            int product;
            for (int i = 1; i <= 10; i++) {
                product = number * i;
                System.out.println(number + " x " + i + " = " + product);
            }
        }
    }
}
