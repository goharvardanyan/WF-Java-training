package homeworks.lesson2;

import java.util.Random;

public class Task2_3 {
    public static void main(String[] args) {
        // Task 2.3 Generate a random int number in range 10 - 100 calculate the square of it. (Math.pow())
        // cast the result to String,  (String.valueOf()) print the result

        Random random = new Random();
        int randomNumber = random.nextInt(90) + 10;
        int square = (int)Math.pow(randomNumber, 2);
        String squareStr = String.valueOf(square);
        System.out.println(squareStr);
    }
}
