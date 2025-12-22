package coreProgramming.string.Level2;
import java.util.Scanner;

public class VotingEligibility {

    // Method to generate ages of students (2-digit ages)
    static int[] generateAges(int numberOfStudents) {

        int[] ages = new int[numberOfStudents];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        return ages;
    }

    // Method to check voting eligibility and return 2D String array
    static String[][] checkVotingEligibility(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            result[i][0] = String.valueOf(ages[i]);

            // Validate age
            if (ages[i] < 0) {
                result[i][1] = "false";
            }
            // Check voting condition
            else if (ages[i] >= 18) {
                result[i][1] = "true";
            }
            else {
                result[i][1] = "false";
            }
        }

        return result;
    }

    // Method to display result in tabular format
    static void displayResult(String[][] data) {

        System.out.println("\nAge\tCan Vote");
        System.out.println("----------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = generateAges(n);
        String[][] votingResult = checkVotingEligibility(ages);
        displayResult(votingResult);

        sc.close();
    }
}
