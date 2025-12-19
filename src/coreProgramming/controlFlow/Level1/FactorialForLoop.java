package coreProgramming.controlFlow.Level1;

import java.util.Scanner;

// Program to find factorial of a number using for loop
class FactorialForLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check for natural number
        if (number > 0) {

            int factorial = 1;

            // Compute factorial using for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            // Output result
            System.out.println("The factorial of " + number + " is " + factorial);

        } else {
            System.out.println("Factorial is not defined for " + number);
        }

        input.close();
    }
}
