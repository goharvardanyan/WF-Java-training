package homeworks.lesson3;

public class Task3_7 {
    public static void main(String[] args) {
        // Task 3.7 Write a program to find the average of even numbers of the first 100 natural numbers.


        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                continue;
            }
            sum = sum + i;
        }
        int average = sum / 50;
        System.out.println(average);
    }
}
