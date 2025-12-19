package coreProgramming.methods.Level1;

import java.util.Scanner;

// Program to print Fibonacci series using a method
class FibonacciMethod {

    // Method to print Fibonacci series
    public void printFibonacci(int n) {

        if (n <= 0) {
            System.out.println("Invalid input. Enter a positive number.");
            return;
        }

        int first = 0;
        int second = 1;

        // Print Fibonacci series
        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter number of terms: ");
        int n = input.nextInt();

        // Create object
        FibonacciMethod fib = new FibonacciMethod();

        // Call method
        fib.printFibonacci(n);

        input.close();
    }
}
