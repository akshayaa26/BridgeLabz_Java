package coreProgramming.methods.Level2;

import java.util.Scanner;

// Program to analyze numbers using methods
class NumberAnalyzer {

    // Method to check positive or negative
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    // Method to check even or odd
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        // Input numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // Analyze numbers
        System.out.println("\n--- Number Analysis ---");
        for (int i = 0; i < numbers.length; i++) {

            if (isPositive(numbers[i])) {
                System.out.print(numbers[i] + " is Positive and ");

                if (isEven(numbers[i])) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            } else {
                System.out.println(numbers[i] + " is Negative");
            }
        }

        // Compare first and last elements
        int result = compare(numbers[0], numbers[numbers.length - 1]);

        System.out.println("\n--- First & Last Comparison ---");
        if (result == 1) {
            System.out.println("First element is greater than last element");
        } else if (result == 0) {
            System.out.println("First and last elements are equal");
        } else {
            System.out.println("First element is less than last element");
        }

        input.close();
    }
}

