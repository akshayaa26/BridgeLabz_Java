package coreProgramming.arrays.Level1;

import java.util.Scanner;

// Program to check voting eligibility of 10 students using array
class Voting {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declare array to store ages of 10 students
        int[] ages = new int[10];

        // Take input for student ages
        System.out.println("Enter the age of 10 students:");

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Student " + (i + 1) + " age: ");
            ages[i] = input.nextInt();
        }

        // Check voting eligibility
        System.out.println("\n--- Voting Eligibility Result ---");

        for (int i = 0; i < ages.length; i++) {

            if (ages[i] < 0) {
                System.out.println("Invalid age entered: " + ages[i]);
            } 
            else if (ages[i] >= 18) {
                System.out.println("Student with age " + ages[i] + " can vote.");
            } 
            else {
                System.out.println("Student with age " + ages[i] + " cannot vote.");
            }
        }

        input.close();
    }
}
