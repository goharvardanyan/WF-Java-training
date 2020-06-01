package homeworks.lesson5;

public class Task5_16 {
    // Task 5.16 Palindrome Check
    // A palindrome is a word which reads the same backward or forward. 'abcba' is a palindrome.
    // Write a boolean returning method that detects if a string is a palindrome.
    // Hint: Use word.charAt(i) to get the character at position i.

    public static void main(String[] args) {
        String word = "abcba";
        System.out.println(isTheStringPalindrome(word));
    }

    public static boolean isTheStringPalindrome(String string) {
        int lastIndex = string.length() - 1;
        boolean isPalindrome = true;
        for (int i = 0; i < string.length() / 2; i++) {
            if (!(string.charAt(i) == string.charAt(lastIndex - i))) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}
