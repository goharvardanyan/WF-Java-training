package homeworks.lesson5;

public class Task5_14 {
    // Task 5.14 Write a method to print all prime numbers less than 100.
    // Call in in main

    public static void main(String[] args) {
        printPrimeNumbersUntil100();
    }

    public static boolean isPrime(int number) {
        boolean isPrime = true;
        if (number == 0 || number == 1) {
            isPrime = false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void printPrimeNumbersUntil100() {
        for (int i = 2; i < 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
