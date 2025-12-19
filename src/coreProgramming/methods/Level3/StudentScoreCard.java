package coreProgramming.methods.Level3;

import java.util.Scanner;

// Program to generate and display student scorecard
class StudentScoreCard {

    // Generate random PCM scores
    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3];

        for (int i = 0; i < n; i++) {
            scores[i][0] = (int) (Math.random() * 90) + 10;
            scores[i][1] = (int) (Math.random() * 90) + 10;
            scores[i][2] = (int) (Math.random() * 90) + 10;
        }
        return scores;
    }

    // Calculate total, average, percentage
    public static double[][] calculateResults(int[][] scores) {
        double[][] result = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {
            double total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3;
            double percent = (total / 300) * 100;

            result[i][0] = Math.round(total * 100.0) / 100.0;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return result;
    }

    // Display scorecard
    public static void displayScoreCard(int[][] scores, double[][] result) {

        System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPercent");

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i][0] + "\t" +
                               scores[i][1] + "\t" +
                               scores[i][2] + "\t" +
                               result[i][0] + "\t" +
                               result[i][1] + "\t" +
                               result[i][2]);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = input.nextInt();

        int[][] scores = generateScores(n);
        double[][] result = calculateResults(scores);
        displayScoreCard(scores, result);

        input.close();
    }
}
