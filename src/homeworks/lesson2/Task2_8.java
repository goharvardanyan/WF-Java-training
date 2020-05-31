package homeworks.lesson2;

import java.util.Scanner;

public class Task2_8 {
    public static void main(String[] args) {
        // Task 2.8

        System.out.println("------------MENU-----------\n" +
                "---> enter 1 for calculating area of the circle\n" +
                "---> enter 2 for calculating perimeter of the circle\n" +
                "---> enter 3 for exit.\n");
        int radius = 5;
        double p = 3.1415926535897932;
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while (number != 3) {
            if (number == 1) {
                double area = p * radius * radius;
                System.out.println("The area of the circle: " + area);
            } else if (number == 2) {
                double perimeter = 2 * p * radius;
                System.out.println("The perimeter of the circle: " + perimeter);
            } else {
                System.out.println("Wrong input");
            }
            System.out.println("------------MENU-----------\n" +
                    "---> enter 1 for calculating area of the circle\n" +
                    "---> enter 2 for calculating perimeter of the circle\n" +
                    "---> enter 3 for exit.\n");
            number = scanner.nextInt();
        }
    }
}
