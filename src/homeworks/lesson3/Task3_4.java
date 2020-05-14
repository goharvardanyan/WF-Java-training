package homeworks.lesson3;

public class Task3_4 {
    public static void main(String[] args) {
        // Task 3.4 Write a program to print the odd numbers in range  {-20,  -60}.

        for (int i = -20; i > -60; i--) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
