package coreProgramming.arrays.Level1;

import java.util.Scanner;

// Program to find factors of a number and store them in a dynamic array
class FactorsDynamicArray {
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

        // Initial array size
        int maxSize = 10;
        int[] factors = new int[maxSize];
        int index = 0;

        // Find factors
        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {

                // Resize array if needed
                if (index == maxSize) {
                    maxSize = maxSize * 2;
                    int[] temp = new int[maxSize];

                    // Copy old values
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }

                    factors = temp;
                }

                // Store factor
                factors[index] = i;
                index++;
            }
        }

        // Display factors
        System.out.println("\n--- Factors of " + number + " ---");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        input.close();
    }
}
