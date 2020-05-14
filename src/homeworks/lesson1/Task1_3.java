package homeworks.lesson1;

public class Task1_3 {
    public static void main(String[] args) {
        // Task 1.3 print the result of the following operations.

        int number1 = -5;
        int number2 = 8;
        int number3 = 6;
        int expression1 = number1 + number2 * number3;
        System.out.println(expression1);
        number1 =55;
        number3 = 9;
        int expression2 = (number1 + number3) % number3;
        System.out.println(expression2);
        number1 = 20;
        number3 = -3;
        int number4 = 5;
        int expression3 = number1 + number3 * number4 / number2;
        System.out.println(expression3);
        number1 = 15;
        number3 = 3;
        int number5 = 2;
        int expression4 = number4 + number1 / number3 * number5 - number2 % number3;
        System.out.println(expression4);
    }
}
