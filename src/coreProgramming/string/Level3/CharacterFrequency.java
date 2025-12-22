package coreProgramming.string.Level3;

import java.util.Scanner;

public class CharacterFrequency {

    // Method to find character frequency and return 2D array
    static String[][] findFrequency(String text) {

        // Step 1: Frequency array for ASCII characters
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        // Step 2: Count unique characters
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] != 0) {
                count++;
                freq[text.charAt(i)] = -freq[text.charAt(i)]; // mark as counted
            }
        }

        // Step 3: Create 2D array
        String[][] result = new String[count][2];
        int index = 0;

        // Reset freq array
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)] = Math.abs(freq[text.charAt(i)]);
        }

        // Step 4: Store character and frequency
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (freq[ch] != 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                freq[ch] = 0; // avoid duplicate entry
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] frequency = findFrequency(text);

        System.out.println("\nCharacter\tFrequency");
        System.out.println("----------------------");

        for (int i = 0; i < frequency.length; i++) {
            System.out.println(frequency[i][0] + "\t\t" + frequency[i][1]);
        }

        sc.close();
    }
}
