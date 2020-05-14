package homeworks.lesson2;

import java.util.Scanner;

public class Task2_6 {
    public static void main(String[] args) {
        // Task 2.6 Write a program to input week number(1-7) from console
        // and print day of week name  (1 - monday …7 - sunday) using switch case.

        System.out.println("Please input week number(1-7)");
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            System.out.println("Wrong input");
        } else {
            int weekNumber = scanner.nextInt();
            switch (weekNumber) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                case 7:
                    System.out.println("Sunday");
                default:
                    System.out.println("Wrong input");
            }
        }
    }
}
