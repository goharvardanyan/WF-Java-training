package homeworks.lesson1;

import java.util.Scanner;

public class Task1_10 {
    public static void main(String[] args) {
        // Task 1.10 Take three numbers from the user and print the greatest number.

        System.out.println("Please input the 1st number:");
        Scanner scanner = new Scanner(System.in);
        int number1;
        int number2;
        int number3;
        int greatest;
        if (!scanner.hasNextInt()) {
            System.out.println("Wrong input");
        } else {
            number1 = scanner.nextInt();
            System.out.println("Plesae input the 2nd number:");
            if (!scanner.hasNextInt()) {
                System.out.println("Wrong input");
            } else {
                number2 = scanner.nextInt();
                System.out.println("Plesae input the 3rd number:");
                if (!scanner.hasNextInt()) {
                    System.out.println("Wrong input");
                } else {
                    number3 = scanner.nextInt();
                    if (number1 >= number2 && number1 >= number3) {
                        greatest = number1;
                    } else if (number2 >= number1 && number2 >= number3) {
                        greatest = number2;
                    } else {
                        greatest = number3;
                    }
                    System.out.println("The greatest: " + greatest);
                }
            }
        }
    }
}
