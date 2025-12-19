package coreProgramming.controlFlow.Level2;

import java.util.Scanner;

// Program to find all factors of a number using for loop
class FactorsUsingForLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check for positive integer
        if (number > 0) {

            System.out.println("The factors of " + number + " are:");

            // Loop to find factors
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }

        } else {
            System.out.println("Please enter a positive integer.");
        }

        input.close();
    }
}
