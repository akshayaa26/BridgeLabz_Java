package coreProgramming.arrays.Level2;

import java.util.Scanner;

// Create SumOfDigits class to compute sum of digits using an array
class SumOfDigits {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take input for a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Validate input
        if (number < 0) {
            System.err.println("Invalid Number.");
            input.close();
            System.exit(0);
        }

        // Find count of digits
        int count = 0;
        int temp = number;

        while (temp > 0) {
            count++;
            temp /= 10;
        }

        // Store digits in array
        int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

        // Find sum of digits
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += digits[i];
        }

        // Display result
        System.out.println("\nSum of Digits: " + sum);

        // Close scanner
        input.close();
    }
}
