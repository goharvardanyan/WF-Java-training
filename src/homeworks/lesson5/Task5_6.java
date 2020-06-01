package homeworks.lesson5;

import java.util.Scanner;

public class Task5_6 {
    // Task 5.6 get a sentence from console
    // write a function to count all words in a string.
    // print count;

    public static void main(String[] args) {
        int count = countAllWordsInSentence(askSentenceFromConsole());
        System.out.println(count);
    }

    public static String askSentenceFromConsole() {
        System.out.println("Please input a sentence ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static int countAllWordsInSentence(String sentence) {
        String[] array = sentence.split(" ");
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals("")) {
                count++;
            }
        }
        return count;
    }
}
