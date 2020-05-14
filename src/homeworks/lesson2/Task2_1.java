package homeworks.lesson2;

import java.util.Random;

public class Task2_1 {
    public static void main(String[] args) {
        // Task 2.1 Generate 2 random int numbers in range 10 - 100
        // calculate the sum. cast it to long.
        // print


        Random random = new Random();
        int randomNumber1 = random.nextInt(90) + 10;
        int randomNumber2 = random.nextInt(90) + 10;
        int sum = randomNumber1 + randomNumber2;
        System.out.println((long) sum);
    }
}
