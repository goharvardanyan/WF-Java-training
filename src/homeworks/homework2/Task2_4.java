package homeworks.homework2;

import java.util.Random;
import java.util.Scanner;

public class Task2_4 {
    public static void main(String[] args) {
        // Task 2.4 Get from the user an int number (from console) in case number > 100
        // Generate a random int in range 50 - number : in case number < 100
        // Generate a random int in range 0 - 50: cast the random number to String
        // print


        System.out.println("Please input an int number");
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            System.out.println("Wrong input");
        } else {
            Random random = new Random();
            int randomNumber;
            int number = scanner.nextInt();
            if (number >= 100) {
                randomNumber = random.nextInt(number - 50) + 50;
            } else {
                randomNumber = random.nextInt(50);
            }
            String castedToString = String.valueOf(randomNumber);
            System.out.println(castedToString);
        }
    }
}
