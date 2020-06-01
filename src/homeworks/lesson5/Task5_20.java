package homeworks.lesson5;

import java.util.Scanner;

public class Task5_20 {
    // Task 5.20 Display a menu

    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu() {
        System.out.println("------------------MENU-------------\n" +
                "Press 1 -  to print “Hello Word”\n" +
                "Press 2 -  to print “Hello Vorld”\n" +
                "Press 3 -  to print “Hello Uorld”\n" +
                "Press 4 -  EXIT\n" +
                "-----------------------------------");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while (true) {
            if (number == 1) {
                System.out.println("Hello Word");
            } else if (number == 2) {
                System.out.println("Hello Vorld");
            } else if (number == 3) {
                System.out.println("Hello Uorld");
            } else if (number == 4) {
                return;
            } else {
                System.out.println("Wrong input");
                System.out.println();
            }
            System.out.println("------------------MENU-------------\n" +
                    "Press 1 -  to print “Hello Word”\n" +
                    "Press 2 -  to print “Hello Vorld”\n" +
                    "Press 3 -  to print “Hello Uorld”\n" +
                    "Press 4 -  EXIT\n" +
                    "-----------------------------------");
            number = scanner.nextInt();
        }
    }
}

