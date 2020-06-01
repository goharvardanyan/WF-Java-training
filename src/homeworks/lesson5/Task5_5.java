package homeworks.lesson5;

import java.util.Scanner;

public class Task5_5 {
    // Task 5.5 get a string from console
    // write a function to display the middle character of a string.

    public static void main(String[] args) {
        printMiddleCharacterOfString(askStringFromConsole());
    }

    public static String askStringFromConsole() {
        System.out.println("Please input a String ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void printMiddleCharacterOfString(String string) {
        int middle = string.length() / 2;
        if (string.length() % 2 == 0) {
            System.out.println("Middle characters of String are '" + string.charAt(middle - 1) + "' and '" + string.charAt(middle) + "'");
        } else {
            System.out.println("Middle character of String is '" + string.charAt(middle) + "'");
        }
    }
}
