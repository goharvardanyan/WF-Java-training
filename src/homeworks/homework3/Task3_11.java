package homeworks.homework3;

import java.util.Scanner;

public class Task3_11 {
    public static void main(String[] args) {
        // Task 3.11 Write a program to determine whether a given number is prime or not.

        System.out.println("Please input a number");
        Scanner scanner = new Scanner(System.in);
        int number  = scanner.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (number == 0 || number == 1 || !isPrime) {
            System.out.println(number + " isn't a prime number");
        } else {
            System.out.println(number + " is a prime number");
        }
    }
}
