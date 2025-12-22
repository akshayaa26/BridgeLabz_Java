package coreProgramming.string.Level2;

import java.util.Scanner;
public class StudentScoreCard {

    // Method to generate random 2-digit PCM marks
    static int[][] generateScores(int students) {

        int[][] marks = new int[students][3];

        for (int i = 0; i < students; i++) {
            marks[i][0] = (int)(Math.random() * 51) + 50; // Physics
            marks[i][1] = (int)(Math.random() * 51) + 50; // Chemistry
            marks[i][2] = (int)(Math.random() * 51) + 50; // Maths
        }
        return marks;
    }

    // Method to calculate total, average and percentage
    static double[][] calculateResults(int[][] marks) {

        double[][] result = new double[marks.length][3];

        for (int i = 0; i < marks.length; i++) {

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return result;
    }

    // Method to calculate grade
    static String[] calculateGrade(double[][] result) {

        String[] grades = new String[result.length];

        for (int i = 0; i < result.length; i++) {

            double percent = result[i][2];

            if (percent >= 90)
                grades[i] = "A";
            else if (percent >= 75)
                grades[i] = "B";
            else if (percent >= 60)
                grades[i] = "C";
            else if (percent >= 40)
                grades[i] = "D";
            else
                grades[i] = "F";
        }
        return grades;
    }

    // Method to display scorecard
    static void displayScoreCard(int[][] marks, double[][] result, String[] grades) {

        System.out.println("\nPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(
                    marks[i][0] + "\t" +
                            marks[i][1] + "\t" +
                            marks[i][2] + "\t" +
                            (int)result[i][0] + "\t" +
                            result[i][1] + "\t" +
                            result[i][2] + "\t" +
                            grades[i]
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int[][] marks = generateScores(students);
        double[][] result = calculateResults(marks);
        String[] grades = calculateGrade(result);

        displayScoreCard(marks, result, grades);

        sc.close();
    }
}
