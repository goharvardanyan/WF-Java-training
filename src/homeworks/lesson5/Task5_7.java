package homeworks.lesson5;

import java.util.Scanner;

public class Task5_7 {
    // Task 5.7 get the year from console (int)
    // write a function to check whether a year entered by the user is a leap year or not.
    // print

    public static void main(String[] args) {
        checkLeapYearOrNot(askYearFromConsole());
    }

    public static int askYearFromConsole() {
        System.out.println("Please input a year ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void checkLeapYearOrNot(int year) {
        if (year % 4 == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " isn't a leap year");
        }
    }
}
