package coreProgramming.string.Level3;

import java.util.Scanner;

public class CharacterFrequencyNested {

    // Method to find character frequency using nested loops
    static String[] findFrequency(String text) {

        char[] chars = text.toCharArray();   // store characters
        int[] freq = new int[chars.length];  // frequency array

        // Step 1: Calculate frequency
        for (int i = 0; i < chars.length; i++) {

            if (chars[i] == '0')
                continue;

            freq[i] = 1;

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // mark duplicate
                }
            }
        }

        // Step 2: Count unique characters
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0')
                count++;
        }

        // Step 3: Store result in 1D String array
        String[] result = new String[count];
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index] = chars[i] + " -> " + freq[i];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] frequency = findFrequency(text);

        System.out.println("\nCharacter Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            System.out.println(frequency[i]);
        }

        sc.close();
    }
}
