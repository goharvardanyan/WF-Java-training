package homeworks.lesson5;

import java.util.Scanner;

public class Task5_8 {
    // Task 5.8 get the password from console (String)
    // write a function to check whether a string is a valid password or not
    //Password rules:
    //-- A password must have at least ten characters.
    //-- A password consists of only letters and digits.
    //-- A password must contain at least two digits.
    //print isValid or not;

    public static void main(String[] args) {
        String password = askPasswordFromConsole();
        printPasswordIsValidOrNot(isValidPassword(password));
    }

    public static String askPasswordFromConsole() {
        System.out.println("Please input a password with at least 10 characters. \n" +
                "It must consist of only letters and digits.\n" +
                "Password must contain at least 2 digits");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static boolean isValidPassword(String password) {
        boolean isValid = true;
        int count = 0;
        char currentChar;
        for (int i = 0; i < password.length(); i++) {
            if (password.length() >= 10) {
                currentChar = password.charAt(i);
                if (currentChar >= 48 && currentChar <= 57) {
                    count++;
                } else if (!(currentChar >= 65 && currentChar <= 90 || currentChar >= 97 && currentChar <= 122)) {
                    isValid = false;
                    break;
                }
            } else {
                isValid = false;
                break;
            }
        }
        if (count < 2) {
            isValid = false;
        }
        return isValid;
    }

    public static void printPasswordIsValidOrNot(boolean isValid) {
        if (isValid) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password isn't valid");
        }
    }
}
