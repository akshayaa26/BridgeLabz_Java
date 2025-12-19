package coreProgramming.controlFlow.Level3;

import java.util.Scanner;

// Program to check whether a number is Prime or not
class PrimeNumberChecker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Prime check works only for numbers greater than 1
        if (number > 1) {

            boolean isPrime = true;

            // Check divisibility
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break; // number is divisible by another number
                }
            }

            // Output result
            if (isPrime) {
                System.out.println(number + " is a Prime Number");
            } else {
                System.out.println(number + " is not a Prime Number");
            }

        } else {
            System.out.println("Prime number check is valid only for numbers greater than 1");
        }

        input.close();
    }
}
