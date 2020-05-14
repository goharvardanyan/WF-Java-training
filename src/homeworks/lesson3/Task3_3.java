package homeworks.lesson3;

public class Task3_3 {
    public static void main(String[] args) {
        // Task 3.3 Write a program to print the even numbers in range  {-20, +60}.

        for (int i = -20; i < 60; i++) {
            if(i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
