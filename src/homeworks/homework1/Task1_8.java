package homeworks.homework1;

import java.util.Scanner;

public class Task1_8 {
    public static void main(String[] args) {
        // Task 1.8 Write a Java program that reads a number in inches, converts it to meters.
        //Note: One inch is 0.0254 meter.


        System.out.println("Please input a value for inch:");
        Scanner scanner = new Scanner(System.in);
        int inchValue = scanner.nextInt();
        double meterValue = 0.0254 * inchValue;
        System.out.println((double)inchValue  + " inch is " + meterValue +  " meters");
    }
}
