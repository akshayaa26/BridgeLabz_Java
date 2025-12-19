package coreProgramming.controlFlow.Level3;

import java.util.Scanner;

// Program to check whether a number is an Abundant Number
class AbundantNumberChecker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Validate input
        if (number > 0) {

            int sum = 0;

            // Find sum of proper divisors
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }

            // Check abundant condition
            if (sum > number) {
                System.out.println(number + " is an Abundant Number");
            } else {
                System.out.println(number + " is not an Abundant Number");
            }

        } else {
            System.out.println("Please enter a positive integer.");
        }

        input.close();
    }
}
