package coreProgramming.arrays.Level2;

import java.util.Scanner;

// Program to calculate percentage and grade of students using arrays
class StudentGradeArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take number of students
        System.out.print("Enter number of students: ");
        int n = input.nextInt();

        // Validate input
        if (n <= 0) {
            System.out.println("Invalid input. Number of students must be positive.");
            input.close();
            System.exit(0);
        }

        // Declare arrays
        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        String[] grade = new String[n];

        // Take marks input
        for (int i = 0; i < n; i++) {

            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter Physics marks: ");
            physics[i] = input.nextInt();

            System.out.print("Enter Chemistry marks: ");
            chemistry[i] = input.nextInt();

            System.out.print("Enter Maths marks: ");
            maths[i] = input.nextInt();

            // Validate marks
            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Marks cannot be negative. Enter again.");
                i--; // repeat for same student
                continue;
            }

            // Calculate percentage
            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;

            // Assign grade
            if (percentage[i] >= 90) {
                grade[i] = "A+";
            } else if (percentage[i] >= 80) {
                grade[i] = "A";
            } else if (percentage[i] >= 70) {
                grade[i] = "B";
            } else if (percentage[i] >= 60) {
                grade[i] = "C";
            } else if (percentage[i] >= 50) {
                grade[i] = "D";
            } else {
                grade[i] = "F";
            }
        }

        // Display report
        System.out.println("\n--- STUDENT REPORT ---");
        for (int i = 0; i < n; i++) {
            System.out.println(
                "Student " + (i + 1) +
                " | Physics: " + physics[i] +
                " | Chemistry: " + chemistry[i] +
                " | Maths: " + maths[i] +
                " | Percentage: " + percentage[i] +
                " | Grade: " + grade[i]
            );
        }

        input.close();
    }
}
