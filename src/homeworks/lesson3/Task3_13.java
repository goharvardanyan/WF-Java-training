package homeworks.lesson3;

public class Task3_13 {
    public static void main(String[] args) {
        // Task 3.13 Write a program to print a string  "ROBOTS_WILL_KILL_ALL_HUMANZ" in reverse order
        // (you can use myString.charAt(x) - google it)

        String string = "ROBOTS_WILL_KILL_ALL_HUMANZ";
        String newString = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            newString = newString + string.charAt(i);
        }
        System.out.println(newString);
    }
}
