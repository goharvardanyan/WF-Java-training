package homeworks.lesson3;

import java.util.Scanner;

public class Task3_12 {
    public static void main(String[] args) {
        // Task3.12 Write a program to display the first n Fibonacci series.
        // (Fibonacci series 0 1 1 2 3 5 8 13 .....)

        System.out.println("Please input number of terms to display : ");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int number1 = 0;
        int number2 = 1;
        if (inputNumber <= 0){
            System.out.println("Wrong input");
        } else {
            System.out.println("Here is the Fibonacci series up to 10 terms :");
            if (inputNumber == 1) {
                System.out.print(number1);
            } else {
                System.out.print(number1 + " " + number2);
            }
            int number3;
            for (int i = 0; i < inputNumber - 2; i++) {
                number3 = number1 + number2;
                System.out.print(" " + number3);
                number1 = number2;
                number2 = number3;
            }
        }
    }
}
