package coreProgramming.methods.Level1;

import java.util.Scanner;

// Program to check whether a number is Palindrome using a method
class PalindromeNumberMethod {

    // Method to check palindrome
    public boolean isPalindrome(int number) {

        int original = number;
        int reversed = 0;

        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Create object
        PalindromeNumberMethod checker = new PalindromeNumberMethod();

        // Call method
        boolean result = checker.isPalindrome(number);

        // Display result
        if (result) {
            System.out.println(number + " is a Palindrome Number");
        } else {
            System.out.println(number + " is not a Palindrome Number");
        }

        input.close();
    }
}
