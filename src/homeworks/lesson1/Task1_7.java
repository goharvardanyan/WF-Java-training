package homeworks.lesson1;

import java.util.Scanner;

public class Task1_7 {
    public static void main(String[] args) {
        // Task 1.7  Write a Java program to convert temperature from Fahrenheit to Celsius degree.

        System.out.println("Please input a degree in Fahrenheit:");
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            System.out.println("Wrong input");
        } else {
            int farenheit = scanner.nextInt();
            double celsius = (double)(farenheit - 32) * 5 / 9;
            System.out.println((double) farenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
        }
    }
}
