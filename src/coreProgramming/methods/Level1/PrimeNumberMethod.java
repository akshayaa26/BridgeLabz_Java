package coreProgramming.methods.Level1;

import java.util.Scanner;

// Program to check whether a number is Prime using a method
class PrimeNumberMethod {

    // Method to check prime number
    public boolean isPrime(int number) {

        // Prime numbers must be greater than 1
        if (number <= 1) {
            return false;
        }

        // Check divisibility
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false; // Not prime
            }
        }

        return true; // Prime
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Create object of class
        PrimeNumberMethod primeChecker = new PrimeNumberMethod();

        // Call method
        boolean result = primeChecker.isPrime(number);

        // Display result
        if (result) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is not a Prime Number");
        }

        input.close();
    }
}
