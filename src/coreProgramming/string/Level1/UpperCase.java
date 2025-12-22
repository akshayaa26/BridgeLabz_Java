package coreProgramming.string.Level1;

import java.util.Scanner;

public class UpperCase {

    // Convert to uppercase using charAt() and ASCII logic
    static String convertUpper(String s) {
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                result = result + (char)(ch - 32);
            } else {
                result = result + ch;
            }
        }
        return result;
    }

    // Compare two strings using charAt()
    static boolean compare(String a, String b) {

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

        // Input full text
        String text = sc.nextLine();

        // User-defined uppercase
        String manualUpper = convertUpper(text);

        // Built-in uppercase
        String builtInUpper = text.toUpperCase();

        // Compare results
        boolean result = compare(manualUpper, builtInUpper);

        // Output
        System.out.println("Manual Uppercase : " + manualUpper);
        System.out.println("Built-in Uppercase : " + builtInUpper);
        System.out.println("Are both equal? " + result);

        sc.close();
    }
}
