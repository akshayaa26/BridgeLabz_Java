package coreProgramming.string.Level3;
import java.util.Scanner;

public class FirstNonRepeatingChar {

    // Method to find first non-repeating character
    static char findFirstNonRepeating(String text) {

        // Frequency array for 256 ASCII characters
        int[] freq = new int[256];

        // Step 1: Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        // Step 2: Find first character with frequency 1
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }

        return '\0'; // No non-repeating character
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        char result = findFirstNonRepeating(text);

        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found");
        }

        sc.close();
    }
}
