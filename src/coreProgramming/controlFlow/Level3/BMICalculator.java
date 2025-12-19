package coreProgramming.controlFlow.Level3;

import java.util.Scanner;

// Program to calculate BMI and determine weight status
class BMICalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter weight in kg: ");
        double weight = input.nextDouble();

        System.out.print("Enter height in cm: ");
        double heightCm = input.nextDouble();

        // Convert height to meters
        double heightMeters = heightCm / 100;

        // Calculate BMI
        double bmi = weight / (heightMeters * heightMeters);

        String status;

        // Determine BMI category
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 25) {
            status = "Normal weight";
        } else if (bmi < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Display result
        System.out.println("\n----- BMI RESULT -----");
        System.out.println("BMI Value: " + bmi);
        System.out.println("Weight Status: " + status);

        input.close();
    }
}
