package coreProgramming.methods.Level2;

import java.util.Scanner;

// Program to calculate sum of first N natural numbers using a method
class SumOfNaturalNumbers {

    // Method to calculate sum using formula
    public static int calculateSum(int n) {

        if (n <= 0) {
            return -1; // Invalid input indicator
        }

        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        // Call method
        int sum = calculateSum(n);

        // Display result
        if (sum == -1) {
            System.out.println("Invalid input. Please enter a positive natural number.");
        } else {
            System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        }

        input.close();
    }
}
