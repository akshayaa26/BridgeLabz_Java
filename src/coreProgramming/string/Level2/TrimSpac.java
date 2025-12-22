package coreProgramming.string.Level2;

import java.util.Scanner;

public class TrimSpac{

    // Method to find start and end index without spaces
    static int[] findTrimIndexes(String text) {

        int start = 0;
        int end = text.length() - 1;

        // Trim leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create substring using charAt()
    static String createSubstring(String text, int start, int end) {

        String result = "";

        for (int i = start; i <= end; i++) {
            result = result + text.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
    static boolean compareStrings(String a, String b) {

        if (a.length() != b.length())
            return false;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();

        // User-defined trim
        int[] indexes = findTrimIndexes(text);
        String manualTrim = createSubstring(text, indexes[0], indexes[1]);

        // Built-in trim
        String builtInTrim = text.trim();

        // Compare
        boolean result = compareStrings(manualTrim, builtInTrim);

        // Display
        System.out.println("\nManual Trim: [" + manualTrim + "]");
        System.out.println("Built-in Trim: [" + builtInTrim + "]");
        System.out.println("Are both equal? " + result);

        sc.close();
    }
}

