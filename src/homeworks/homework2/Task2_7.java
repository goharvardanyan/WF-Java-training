package homeworks.homework2;

import java.util.Scanner;

public class Task2_7 {
    public static void main(String[] args) {
        // Task 2.7 Write  Program to print number of days in month using switch...case
        // Input “monthName” from console (you can get string from console by  scanner.nextLine())

        System.out.println("Please input month name");
        Scanner scanner = new Scanner(System.in);
        String monthName = scanner.nextLine().toLowerCase();
        switch (monthName) {
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                System.out.println("Number of days: 31");
                break;
            case "april":
            case "june":
            case "september":
            case "november":
                System.out.println("Number of days: 30");
                break;
            case "february":
                System.out.println("Number of days: 28 or 29");
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}
