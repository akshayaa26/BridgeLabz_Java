package coreProgramming.controlFlow.Level3;

import java.util.Scanner;

// Program to calculate percentage, grade, and remarks
class GradeCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take marks input
        System.out.print("Enter Physics marks: ");
        int physics = input.nextInt();

        System.out.print("Enter Chemistry marks: ");
        int chemistry = input.nextInt();

        System.out.print("Enter Maths marks: ");
        int maths = input.nextInt();

        // Calculate total and percentage
        int totalMarks = physics + chemistry + maths;
        double percentage = totalMarks / 3.0;

        String grade;
        String remarks;

        // Determine grade and remarks
        if (percentage >= 90) {
            grade = "A+";
            remarks = "Excellent";
        } else if (percentage >= 80) {
            grade = "A";
            remarks = "Very Good";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Good";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Average";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Pass";
        } else {
            grade = "F";
            remarks = "Fail";
        }

        // Display output
        System.out.println("\n----- RESULT -----");
        System.out.println("Total Marks: " + totalMarks + "/300");
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        input.close();
    }
}
