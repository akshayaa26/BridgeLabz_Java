package coreProgramming.controlFlow.Level2;

import java.util.Scanner;

// Program to find the power of a number using for loop
class PowerOfNumberForLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user inputs
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        System.out.print("Enter the power (positive integer): ");
        int power = input.nextInt();

        // Validate inputs
        if (number > 0 && power >= 0) {

            int result = 1;

            // Compute power using for loop
            for (int i = 1; i <= power; i++) {
                result *= number;
            }

            // Output
            System.out.println(number + " raised to the power " + power + " is " + result);

        } else {
            System.out.println("Please enter valid positive integers.");
        }

        input.close();
    }
}
