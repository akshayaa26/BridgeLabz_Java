package coreProgramming.methods.Level2;

import java.util.Scanner;

// Program to check voting eligibility of students using method
public class StudentVoteChecker {

    // Method to check if a student can vote
    public boolean canStudentVote(int age) {

        // Validate age
        if (age < 0) {
            return false; // Invalid age, cannot vote
        }

        // Check voting eligibility
        if (age >= 18) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Array to store ages of 10 students
        int[] ages = new int[10];

        // Create object of class
        StudentVoteChecker checker = new StudentVoteChecker();

        // Take input and check voting eligibility
        for (int i = 0; i < ages.length; i++) {

            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();

            boolean canVote = checker.canStudentVote(ages[i]);

            if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }

        input.close();
    }
}
