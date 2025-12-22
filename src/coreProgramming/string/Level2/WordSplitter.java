package coreProgramming.string.Level2;

import java.util.Scanner;

public class WordSplitter {

    // Method to find length without using length()
    static int findLength(String text) {
        int count = 0;
        for (char c : text.toCharArray()) {
            count++;
        }
        return count;
    }

    // Method to split text into words using charAt()
    static String[] splitWords(String text) {

        int length = findLength(text);

        // Step 1: Count words
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Step 2: Store space indexes
        int[] spaceIndexes = new int[wordCount - 1];
        int k = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[k++] = i;
            }
        }

        // Step 3: Extract words
        String[] words = new String[wordCount];
        int start = 0;

        for (int i = 0; i < spaceIndexes.length; i++) {
            words[i] = "";
            for (int j = start; j < spaceIndexes[i]; j++) {
                words[i] += text.charAt(j);
            }
            start = spaceIndexes[i] + 1;
        }

        // Last word
        words[wordCount - 1] = "";
        for (int i = start; i < length; i++) {
            words[wordCount - 1] += text.charAt(i);
        }

        return words;
    }

    // Method to compare two String arrays
    static boolean compareArrays(String[] a, String[] b) {

        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        // User-defined split
        String[] manualWords = splitWords(text);

        // Built-in split
        String[] builtInWords = text.split(" ");

        // Compare
        boolean result = compareArrays(manualWords, builtInWords);

        // Display
        System.out.println("\nManual Split:");
        for (String word : manualWords) {
            System.out.println(word);
        }

        System.out.println("\nBuilt-in Split:");
        for (String word : builtInWords) {
            System.out.println(word);
        }

        System.out.println("\nAre both results equal? " + result);

        sc.close();
    }
}

