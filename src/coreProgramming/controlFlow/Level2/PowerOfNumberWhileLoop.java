package coreProgramming.controlFlow.Level2;

import java.util.Scanner;

// Program to find the power of a number using while loop
class PowerOfNumberWhileLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user inputs
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        System.out.print("Enter the power: ");
        int power = input.nextInt();

        // Validate inputs
        if (number > 0 && power >= 0) {

            int result = 1;
            int counter = 0;

            // While loop to calculate power
            while (counter < power) {
                result *= number;
                counter++;
            }

            // Output
            System.out.println(number + " raised to the power " + power + " is " + result);

        } else {
            System.out.println("Please enter valid positive integers.");
        }

        input.close();
    }
}
