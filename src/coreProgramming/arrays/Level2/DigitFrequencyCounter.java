package coreProgramming.arrays.Level2;

import java.util.Scanner;

// Program to find the frequency of each digit in a number using an array
class DigitFrequencyCounter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Validate input
        if (number < 0) {
            System.out.println("Invalid input. Please enter a non-negative number.");
            input.close();
            System.exit(0);
        }

        int temp = number;
        int count = 0;

        // Special case: number = 0
        if (temp == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                count++;
                temp /= 10;
            }
        }

        // Store digits in array
        int[] digits = new int[count];
        temp = number;

        if (number == 0) {
            digits[0] = 0;
        } else {
            for (int i = 0; i < count; i++) {
                digits[i] = temp % 10;
                temp /= 10;
            }
        }

        // Frequency array for digits 0–9
        int[] frequency = new int[10];

        // Count digit frequency
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        // Display frequency
        System.out.println("\n--- Digit Frequency ---");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s)");
            }
        }

        input.close();
    }
}
