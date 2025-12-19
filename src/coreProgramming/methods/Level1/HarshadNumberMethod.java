package coreProgramming.methods.Level1;

import java.util.Scanner;

// Program to check whether a number is a Harshad number using a method
class HarshadNumberMethod {

    // Method to check Harshad number
    public boolean isHarshad(int number) {

        if (number <= 0) {
            return false; // Harshad numbers are positive
        }

        int original = number;
        int sumOfDigits = 0;

        // Calculate sum of digits
        while (number > 0) {
            sumOfDigits += number % 10;
            number /= 10;
        }

        // Check divisibility
        return original % sumOfDigits == 0;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Create object
        HarshadNumberMethod checker = new HarshadNumberMethod();

        // Call method
        boolean result = checker.isHarshad(number);

        // Display result
        if (result) {
            System.out.println(number + " is a Harshad Number");
        } else {
            System.out.println(number + " is not a Harshad Number");
        }

        input.close();
    }
}
