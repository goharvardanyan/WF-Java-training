package homeworks.homework2;

import java.util.Random;

public class Task2_2 {
    public static void main(String[] args) {
        // Task 2.2 Generate 2 random int numbers in range 10 - 100 calculate the product.
        //in case product is even cast it to long in case product is odd cast it to double
        //Print the product

        Random random = new Random();
        int randomNumber1 = random.nextInt(90) + 10;
        int randomNumber2 = random.nextInt(90) + 10;
        int product = randomNumber1 * randomNumber2;
        if (product % 2 == 0) {
            System.out.println((long)product);
        } else {
            System.out.println((double)product);
        }

    }
}
