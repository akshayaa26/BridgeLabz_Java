package coreProgramming.string.Level1;

import java.util.Scanner;

public class LowerCase {

    // Convert to lowercase using charAt() and ASCII logic
    static String convertLower(String s) {
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                result = result + (char)(ch + 32);
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

        // User-defined lowercase
        String manualLower = convertLower(text);

        // Built-in lowercase
        String builtInLower = text.toLowerCase();

        // Compare results
        boolean result = compare(manualLower, builtInLower);

        // Output
        System.out.println("Manual Lowercase : " + manualLower);
        System.out.println("Built-in Lowercase : " + builtInLower);
        System.out.println("Are both equal? " + result);

        sc.close();
    }
}
