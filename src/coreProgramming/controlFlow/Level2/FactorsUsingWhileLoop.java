package coreProgramming.controlFlow.Level2;

import java.util.Scanner;

// Program to find all factors of a number using while loop
class FactorsUsingWhileLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Validate positive integer
        if (number > 0) {

            System.out.println("The factors of " + number + " are:");

            int i = 1;

            // While loop to find factors
            while (i <= number) {
                if (number % i == 0) {
                    System.out.println(i);
                }
                i++; // increment counter
            }

        } else {
            System.out.println("Please enter a positive integer.");
        }

        input.close();
    }
}
