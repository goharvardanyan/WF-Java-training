package homeworks.homework3;

import java.util.Scanner;

public class Task3_10 {
    public static void main(String[] args) {
        // Task 3.10 Write a program to display the multiplication table of a given integer

        System.out.println("Input the number (Table to be calculated) :");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int product;
        for (int i = 1; i <= 10; i++) {
            product = number * i;
            System.out.println(number + " X " + i + " = " + product);
        }
    }
}
