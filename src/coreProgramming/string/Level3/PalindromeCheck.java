package coreProgramming.string.Level3;
import java.util.Scanner;

public class PalindromeCheck {

    // LOGIC 1: Using start & end comparison (loop)
    static boolean isPalindromeLoop(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // LOGIC 2: Using recursion
    static boolean isPalindromeRecursive(String text, int start, int end) {

        if (start >= end)
            return true;

        if (text.charAt(start) != text.charAt(end))
            return false;

        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Helper: Reverse string using charAt()
    static char[] reverseString(String text) {

        char[] rev = new char[text.length()];
        int index = 0;

        for (int i = text.length() - 1; i >= 0; i--) {
            rev[index++] = text.charAt(i);
        }
        return rev;
    }

    // LOGIC 3: Using character arrays
    static boolean isPalindromeArray(String text) {

        char[] original = text.toCharArray();
        char[] reverse = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        boolean result1 = isPalindromeLoop(text);
        boolean result2 = isPalindromeRecursive(text, 0, text.length() - 1);
        boolean result3 = isPalindromeArray(text);

        System.out.println("\nPalindrome Check Results:");
        System.out.println("Logic 1 (Loop)       : " + result1);
        System.out.println("Logic 2 (Recursion)  : " + result2);
        System.out.println("Logic 3 (Array)      : " + result3);

        sc.close();
    }
}
