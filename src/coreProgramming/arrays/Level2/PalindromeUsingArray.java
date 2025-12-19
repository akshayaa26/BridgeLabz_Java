package coreProgramming.arrays.Level2;

import java.util.Scanner;

// Program to check whether a number is a Palindrome using an array
class PalindromeUsingArray {
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

        // Check palindrome
        boolean isPalindrome = true;
        for (int i = 0; i < digits.length / 2; i++) {
            if (digits[i] != digits[digits.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println(number + " is a Palindrome Number");
        } else {
            System.out.println(number + " is not a Palindrome Number");
        }

        input.close();
    }
}
