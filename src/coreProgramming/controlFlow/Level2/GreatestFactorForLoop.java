package coreProgramming.controlFlow.Level2;

import java.util.Scanner;

// Program to find the greatest factor of a number excluding itself using for loop
class GreatestFactorForLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Validate positive integer
        if (number > 1) {

            int greatestFactor = 1;

            // Loop from number-1 down to 1
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    greatestFactor = i;
                    break; // first match is the greatest factor
                }
            }

            // Output
            System.out.println("The greatest factor of " + number +
                               " excluding itself is " + greatestFactor);

        } else {
            System.out.println("Please enter an integer greater than 1.");
        }

        input.close();
    }
}
