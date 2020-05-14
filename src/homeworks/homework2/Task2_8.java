package homeworks.homework2;

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

        if (!scanner.hasNextInt()) {
            System.out.println("Wrong input");
        } else {
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    double area = p * radius * radius;
                    System.out.println("The area of the circle: " + area);
                    break;
                case 2:
                    double perimeter = 2 * p * radius;
                    System.out.println("The perimeter of the circle: " + perimeter);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Wrong input");
            }
        }
    }
}
