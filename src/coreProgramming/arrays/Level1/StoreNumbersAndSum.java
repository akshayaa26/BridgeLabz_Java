package coreProgramming.arrays.Level1;

import java.util.Scanner;

// Program to store up to 10 numbers or stop on 0/negative and find sum
class StoreNumbersAndSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declare array and variables
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter numbers (0 or negative number to stop):");

        // Infinite loop for input
        while (true) {

            double value = input.nextDouble();

            // Stop condition
            if (value <= 0) {
                break;
            }

            // Check array limit
            if (index == numbers.length) {
                System.out.println("Maximum limit reached (10 numbers).");
                break;
            }

            // Store value in array
            numbers[index] = value;
            index++;
        }

        // Calculate sum of stored values
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display result
        System.out.println("\n--- Stored Numbers ---");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("Total Sum = " + total);

        input.close();
    }
}
