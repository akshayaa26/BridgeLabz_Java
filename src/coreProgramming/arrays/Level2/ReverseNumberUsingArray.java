package coreProgramming.arrays.Level2;

import java.util.Scanner;

// Program to reverse a number using an array
class ReverseNumberUsingArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();

        // Validate input
        if (number <= 0) {
            System.out.println("Invalid input. Please enter a positive number.");
            input.close();
            System.exit(0);
        }

        int temp = number;
        int count = 0;

        // Count digits
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        // Store digits in array
        int[] digits = new int[count];
        temp = number;

        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Build reversed number
        int reversed = 0;
        for (int i = 0; i < digits.length; i++) {
            reversed = reversed * 10 + digits[i];
        }

        // Display result
        System.out.println("\nOriginal Number: " + number);
        System.out.println("Reversed Number: " + reversed);

        input.close();
    }
}
