package coreProgramming.methods.Level2;

import java.util.Scanner;

// Program to find factors, sum, product and sum of squares using methods
class FactorAnalytics {

    // Method to find factors and return them as an array
    public static int[] getFactors(int number) {

        // First pass: count factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Allocate array
        int[] factors = new int[count];

        // Second pass: fill factors
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to find sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    // Method to find product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    // Method to find sum of squares of factors
    public static double sumOfSquaresOfFactors(int[] factors) {
        double sumSq = 0.0;
        for (int f : factors) {
            sumSq += Math.pow(f, 2);
        }
        return sumSq;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // User input
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Validation
        if (number <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            input.close();
            return;
        }

        // Get factors
        int[] factors = getFactors(number);

        // Display factors
        System.out.print("\nFactors of " + number + ": ");
        for (int f : factors) {
            System.out.print(f + " ");
        }

        // Compute analytics
        int sum = sumOfFactors(factors);
        long product = productOfFactors(factors);
        double sumSquares = sumOfSquaresOfFactors(factors);

        // Display results
        System.out.println("\nSum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of squares of factors: " + sumSquares);

        input.close();
    }
}
