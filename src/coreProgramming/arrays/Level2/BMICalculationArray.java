package coreProgramming.arrays.Level2;

import java.util.Scanner;

// Program to calculate BMI of multiple persons using arrays
class BMICalculationArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take number of persons
        System.out.print("Enter number of persons: ");
        int n = input.nextInt();

        // Validate input
        if (n <= 0) {
            System.out.println("Invalid input. Number of persons must be positive.");
            input.close();
            System.exit(0);
        }

        // Declare arrays
        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Take input for each person
        for (int i = 0; i < n; i++) {

            System.out.println("\nPerson " + (i + 1));

            System.out.print("Enter height in cm: ");
            height[i] = input.nextDouble();

            System.out.print("Enter weight in kg: ");
            weight[i] = input.nextDouble();

            // Validate height and weight
            if (height[i] <= 0 || weight[i] <= 0) {
                System.out.println("Invalid height or weight. Enter positive values.");
                i--; // repeat input for this person
                continue;
            }

            // Calculate BMI
            bmi[i] = weight[i] / Math.pow(height[i] / 100, 2);

            // Determine status
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 25) {
                status[i] = "Normal";
            } else if (bmi[i] < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Display results
        System.out.println("\n--- BMI REPORT ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) +
                    " | Height: " + height[i] +
                    " cm | Weight: " + weight[i] +
                    " kg | BMI: " + bmi[i] +
                    " | Status: " + status[i]);
        }

        input.close();
    }
}
