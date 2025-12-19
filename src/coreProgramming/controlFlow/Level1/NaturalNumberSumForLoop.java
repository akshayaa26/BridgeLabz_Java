package coreProgramming.controlFlow.Level1;

import java.util.Scanner;

// Program to find sum of n natural numbers using for loop
// and compare it with the formula result
class NaturalNumberSumForLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        // Check if input is a natural number
        if (n > 0) {

            // Sum using for loop
            int sumUsingLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumUsingLoop += i;
            }

            // Sum using formula
            int sumUsingFormula = n * (n + 1) / 2;

            // Display results
            System.out.println("Sum using for loop = " + sumUsingLoop);
            System.out.println("Sum using formula = " + sumUsingFormula);

            // Compare results
            if (sumUsingLoop == sumUsingFormula) {
                System.out.println("Both results are equal. Computation is correct.");
            } else {
                System.out.println("Results are not equal. Computation is incorrect.");
            }

        } else {
            System.out.println("The number " + n + " is not a natural number.");
        }

        input.close();
    }
}
