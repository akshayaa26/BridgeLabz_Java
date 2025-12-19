package coreProgramming.controlFlow.Level2;

import java.util.Scanner;

// Program to find the greatest factor of a number excluding itself using while loop
class GreatestFactorWhileLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Validate input
        if (number > 1) {

            int greatestFactor = 1;
            int counter = number - 1;

            // While loop to find greatest factor
            while (counter >= 1) {
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break; // exit loop after finding greatest factor
                }
                counter--;
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
