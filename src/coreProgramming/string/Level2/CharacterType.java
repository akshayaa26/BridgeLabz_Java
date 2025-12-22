package coreProgramming.string.Level2;
import java.util.Scanner;

public class CharacterType {

    // Method to check character type
    static String checkCharacterType(char ch) {

        // Convert uppercase to lowercase using ASCII
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }

        // Check if alphabet
        if (ch >= 'a' && ch <= 'z') {

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    // Method to analyze string and return 2D array
    static String[][] analyzeString(String text) {

        String[][] result = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            result[i][0] = String.valueOf(text.charAt(i));
            result[i][1] = checkCharacterType(text.charAt(i));
        }

        return result;
    }

    // Method to display 2D array in tabular format
    static void displayTable(String[][] data) {

        System.out.println("\nCharacter\tType");
        System.out.println("----------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] analysisResult = analyzeString(text);
        displayTable(analysisResult);

        sc.close();
    }
}
