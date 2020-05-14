package homeworks.homework3;

import java.util.Scanner;

public class Task3_9 {
    public static void main(String[] args) {
        // Task 3.9 Write a program to display the cube of the number upto given integer.

        System.out.println("Please input a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int cube;
        for (int i = 1; i <= number; i++) {
            cube = i * i * i;
            System.out.println("Number is : " + i + " and cube of the " + i + " is : " + cube);
        }
    }
}
