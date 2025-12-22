package coreProgramming.string.Level2;

import java.util.Scanner;

public class WordLength {

    // Method to find string length without using length()
    static int findLength(String text) {
        int count = 0;
        for (char c : text.toCharArray()) {
            count++;
        }
        return count;
    }

    // Method to split text into words using charAt()
    static String[] splitWords(String text) {

        int len = findLength(text);

        // Count words
        int wordCount = 1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store words
        String[] words = new String[wordCount];
        int index = 0;
        words[index] = "";

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                index++;
                words[index] = "";
            } else {
                words[index] += text.charAt(i);
            }
        }

        return words;
    }

    // Method to create 2D array of word and length
    static String[][] createWordLengthTable(String[] words) {

        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(findLength(words[i]));
        }

        return table;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] result = createWordLengthTable(words);

        // Display result
        System.out.println("\nWord\tLength");
        System.out.println("--------------");

        for (int i = 0; i < result.length; i++) {
            int length = Integer.parseInt(result[i][1]);
            System.out.println(result[i][0] + "\t" + length);
        }

        sc.close();
    }
}
