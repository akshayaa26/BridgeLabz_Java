package coreProgramming.string.Level3;

import java.util.Scanner;

public class UniqueCharacter {

    // Method to find length without using length()
    static int findLength(String text) {
        int count = 0;
        for (char c : text.toCharArray()) {
            count++;
        }
        return count;
    }

    // Method to find unique characters using charAt()
    static char[] findUniqueCharacters(String text) {

        int len = findLength(text);

        // Temporary array to store unique characters
        char[] temp = new char[len];
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            // Check with previous characters
            for (int j = 0; j < i; j++) {
                if (current == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = current;
                uniqueCount++;
            }
        }

        // Create final array of exact size
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        char[] uniqueChars = findUniqueCharacters(text);

        System.out.println("\nUnique Characters:");
        for (int i = 0; i < uniqueChars.length; i++) {
            System.out.print(uniqueChars[i] + " ");
        }

        sc.close();
    }
}
