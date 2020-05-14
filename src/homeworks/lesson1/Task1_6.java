package homeworks.lesson1;

public class Task1_6 {
    public static void main(String[] args) {
        // Task 1.6  print the area and perimeter of a circle.

        double radius = 7.5;
        double p = 3.1415926535897932;
        double perimeter = 2 * p * radius;
        double area = p * radius * radius;
        System.out.println("Perimeter is " + perimeter);
        System.out.println("Area is " + area);
    }
}
