package coreProgramming.string.Level2;
import java.util.Scanner;

public class StringLength {

    // Method to find length without using length()
    public static int findLength(String text) {

        char[] chars = text.toCharArray();
        int count = 0;

        for (int i = 0; i < chars.length; i++) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        int customLength = findLength(text);
        int builtInLength = text.length();

        System.out.println("Length without length(): " + customLength);
        System.out.println("Length using length(): " + builtInLength);

        sc.close();
    }
}
