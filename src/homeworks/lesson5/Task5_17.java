package homeworks.lesson5;

public class Task5_17 {
    // Task5.17 write a function that takes as an argument int number and calculates its factorial
    // print

    public static void main(String[] args) {
        int number = 4;
        System.out.println(factorialOfNumber(number));
    }

    public static int factorialOfNumber(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
}
