package homeworks.lesson3;

public class Task3_6 {
    public static void main(String[] args) {
        // Task 3.6 Write a program to find the sum of odd numbers of the first 100 natural numbers.

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0){
                continue;
            }
            sum += i;
        }
        System.out.println(sum);
    }
}
