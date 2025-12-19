package coreProgramming.arrays.Level1;

import java.util.Scanner;

// Program to implement FizzBuzz using an array
class FizzBuzzArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Validate input
        if (number <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            input.close();
            System.exit(0);
        }

        // Create String array to store results
        String[] results = new String[number + 1];

        // Store FizzBuzz results in array
        for (int i = 1; i <= number; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }

        // Display results with positions
        System.out.println("\n--- FizzBuzz Array Output ---");
        for (int i = 1; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }

        input.close();
    }
}
