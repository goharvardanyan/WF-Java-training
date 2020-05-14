package homeworks.lesson1;

import java.util.Scanner;

public class Task1_11 {
    public static void main(String[] args) {
        // Task 1.11 Write a program in Java to input 5 numbers from the keyboard and find their sum and average.

        System.out.println("Input five numbers");
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        for(int i = 0; i < 5; i++) {
            number = scanner.nextInt();
            sum += number;
        }
        double average = (double) sum / 5;
        System.out.println("The sum of 5 numbers is : " + sum);
        System.out.println("The Average is : " + average);
    }
}
