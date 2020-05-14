package homeworks.homework3;

public class Task3_5 {
    public static void main(String[] args) {
        // Task 3.5 Write a program to find the sum of the first 100 natural numbers.
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
