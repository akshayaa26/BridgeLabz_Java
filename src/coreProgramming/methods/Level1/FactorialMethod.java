package coreProgramming.methods.Level1;

import java.util.Scanner;

// Program to calculate factorial using a method
class FactorialMethod {

    // Method to calculate factorial
    public long calculateFactorial(int number) {

        if (number < 0) {
            return -1; // Invalid input indicator
        }

        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Create object
        FactorialMethod calculator = new FactorialMethod();

        // Call method
        long result = calculator.calculateFactorial(number);

        // Display result
        if (result == -1) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("Factorial of " + number + " is: " + result);
        }

        input.close();
    }
}
