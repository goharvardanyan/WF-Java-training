package homeworks.lesson3;

import java.util.Scanner;

public class Task3_8 {
    public static void main(String[] args) {
        // Task 3.8 Write a program to read 10 numbers from keyboard (console) and find their sum and average.

        System.out.println("Please input 10 numbers");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (count != 10) {
                int currentNumber = scanner.nextInt();
                sum = sum + currentNumber;
                count++;
        }
        double average = (double) sum / 10;
        System.out.println(average);
    }
}
