package coreProgramming.methods.Level3;

import java.util.Scanner;

// Program to analyze array values using methods
class ArrayAnalyzer {

    // Method to find sum
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int n : arr) {
            sum += n;
        }
        return sum;
    }

    // Method to find average
    public static double findAverage(int[] arr) {
        return (double) findSum(arr) / arr.length;
    }

    // Method to find minimum value
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int n : arr) {
            if (n < min) {
                min = n;
            }
        }
        return min;
    }

    // Method to find maximum value
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int n : arr) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        int[] numbers = new int[n];

        // Input elements
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Display results
        System.out.println("\n--- ARRAY ANALYSIS ---");
        System.out.println("Sum     : " + findSum(numbers));
        System.out.println("Average : " + findAverage(numbers));
        System.out.println("Minimum : " + findMin(numbers));
        System.out.println("Maximum : " + findMax(numbers));

        input.close();
    }
}

