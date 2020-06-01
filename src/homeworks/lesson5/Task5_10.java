package homeworks.lesson5;

import java.util.Scanner;

public class Task5_10 {
    // Task 5.10 get sides of the triangle
    // write a function to check if the triangle with that sides is valid triangle
    // write a function to calculate the perimeter of the triangle
    // write a function to calculate the area of the triangle
    // in case triangle is valid
    //	- calculate perimeter
    //	- calculate area
    // print both

    public static void main(String[] args) {
        System.out.println("Please input sides of the triangle ");
        Scanner scanner = new Scanner(System.in);
        int sideA = scanner.nextInt();
        int sideB = scanner.nextInt();
        int sideC = scanner.nextInt();
        if (isValidTriangle(sideA, sideB, sideC)) {
            System.out.println("The Perimeter of Triangle is " + calculatePerimeterOfTriangle(sideA, sideB, sideC));
            System.out.println("The Area of Triangle is " + calculateAreaOfTriangle(sideA, sideB, sideC));
        } else {
            System.out.println("The sides aren't valid");
        }
    }

    public static boolean isValidTriangle(int sideA, int sideB, int sideC) {
        boolean isValid = false;
        if (sideA > 0 && sideB > 0 && sideC > 0) {
            if (sideB + sideC > sideA && sideA + sideB > sideC && sideA + sideC > sideB) {
                isValid = true;
            }
        }
        return isValid;
    }

    public static int calculatePerimeterOfTriangle(int sideA, int sideB, int sideC) {
        return sideA + sideB + sideC;
    }

    public static double calculateAreaOfTriangle(int sideA, int sideB, int sideC) {
        double p = (double)(sideA + sideB + sideC) / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }
}
