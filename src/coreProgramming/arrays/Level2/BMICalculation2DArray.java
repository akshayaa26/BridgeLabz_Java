package coreProgramming.arrays.Level2;

import java.util.Scanner;

// Program to calculate BMI using a 2D array
class BMICalculation2DArray {
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

        // 2D array to store height, weight, BMI
        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];

        // Input height and weight
        for (int i = 0; i < n; i++) {

            System.out.println("\nPerson " + (i + 1));

            System.out.print("Enter height in cm: ");
            personData[i][0] = input.nextDouble();

            System.out.print("Enter weight in kg: ");
            personData[i][1] = input.nextDouble();

            // Validate inputs
            if (personData[i][0] <= 0 || personData[i][1] <= 0) {
                System.out.println("Invalid height or weight. Enter positive values.");
                i--; // repeat input for this person
                continue;
            }

            // Calculate BMI
            double heightMeters = personData[i][0] / 100;
            personData[i][2] = personData[i][1] / (heightMeters * heightMeters);

            // Determine weight status
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 25) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display report
        System.out.println("\n--- BMI REPORT ---");
        for (int i = 0; i < n; i++) {
            System.out.println(
                "Person " + (i + 1) +
                " | Height: " + personData[i][0] + " cm" +
                " | Weight: " + personData[i][1] + " kg" +
                " | BMI: " + personData[i][2] +
                " | Status: " + weightStatus[i]
            );
        }

        input.close();
    }
}
