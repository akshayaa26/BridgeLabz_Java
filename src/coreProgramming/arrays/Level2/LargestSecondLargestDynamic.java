package coreProgramming.arrays.Level2;

import java.util.Scanner;

// Program to store all digits dynamically and find largest & second largest digit
class LargestSecondLargestDynamic {
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

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits and dynamically resize array if needed
        while (number != 0) {

            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];

                // Copy old values
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                digits = temp;
            }

            digits[index] = number % 10;
            number /= 10;
            index++;
        }

        // Initialize largest and second largest
        int largest = 0;
        int secondLargest = 0;

        // Find largest and second largest digits
        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } 
            else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display results
        System.out.println("\nLargest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        input.close();
    }
}
