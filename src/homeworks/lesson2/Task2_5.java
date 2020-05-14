package homeworks.lesson2;

import java.util.Random;
import java.util.Scanner;

public class Task2_5 {
    public static void main(String[] args) {
        // Task 2.5 Generate 2 random intsvTake from console an operator (+, -, * or /)
        // perform calculation based on operator (USING SWITCH). print the result


        System.out.println("Please input one of this operators +, -, * or /");
        Random random = new Random();
        int randomNumber1 = random.nextInt();
        int randomNumber2 = random.nextInt();
        Scanner scanner = new Scanner(System.in);
        String operator = scanner.next();
        switch (operator) {
            case "+":
                System.out.println(randomNumber1 + randomNumber2);
                break;
            case "-":
                System.out.println(randomNumber1 - randomNumber2);
                break;
            case "*":
                System.out.println(randomNumber1 * randomNumber2);
                break;
            case "/":
                System.out.println(randomNumber1 / randomNumber2);
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}
