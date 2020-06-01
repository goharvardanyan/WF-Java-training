package homeworks.lesson5;

import java.util.Scanner;

public class Task5_9 {
    // Task 5.9 get radius from console
    // write a function to calculate the area of the circle
    // write a function to calculate the perimeter of the circle

    public static void main(String[] args) {
        int radius = askForRadius();
        System.out.println("The Area of the circle is " + calculateAreaOfCircle(radius));
        System.out.println("The Perimeter of the circle is " + calculatePerimeterOfCircle(radius));
    }

    public static int askForRadius() {
        System.out.println("Please input radius ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static double calculateAreaOfCircle(int radius) {
        return Math.PI * radius * radius;
    }

    public static double calculatePerimeterOfCircle(int radius) {
        return 2 * Math.PI * radius;
    }
}
