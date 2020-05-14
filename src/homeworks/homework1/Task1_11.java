package homeworks.homework1;

import java.util.Scanner;

public class Task1_11 {
    public static void main(String[] args) {
        // Task 1.11 Write a program in Java to input 5 numbers from the keyboard and find their sum and average.

        System.out.println("Input five numbers");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();
        int number5 = scanner.nextInt();
        int sum = number1 + number2 + number3 + number4 + number5;
        double average = (double)sum / 5;
        System.out.println("The sum of 5 numbers is : " + sum);
        System.out.println("The Average is : " + average);
    }
}
