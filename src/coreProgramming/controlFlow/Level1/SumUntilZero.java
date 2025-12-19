package coreProgramming.controlFlow.Level1;

import java.util.Scanner;

// Program to find the sum of numbers until user enters 0
class SumUntilZero {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Initialize total sum
        double total = 0.0;

        // Variable to store user input
        double number;

        // Loop until user enters 0
        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            number = input.nextDouble();

            // Check sentinel value
            if (number == 0) {
                break;
            }

            // Add number to total
            total += number;
        }

        // Display final result
        System.out.println("The total sum of entered numbers is " + total);

        input.close();
    }
}
