package coreProgramming.arrays.Level1;

import java.util.Scanner;

// Program to analyze numbers using array
class NumberAnalysis {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declare array of size 5
        int[] numbers = new int[5];

        // Take user input
        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // Analyze each number
        System.out.println("\n--- Number Analysis ---");

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > 0) {

                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is a positive even number");
                } else {
                    System.out.println(numbers[i] + " is a positive odd number");
                }

            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is a negative number");
            } else {
                System.out.println("The number is zero");
            }
        }

        // Compare first and last elements
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        System.out.println("\n--- First & Last Comparison ---");

        if (first == last) {
            System.out.println("First and last elements are equal");
        } else if (first > last) {
            System.out.println("First element is greater than last element");
        } else {
            System.out.println("First element is less than last element");
        }

        input.close();
    }
}
