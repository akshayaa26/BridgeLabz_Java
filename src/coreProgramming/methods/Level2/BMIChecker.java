package coreProgramming.methods.Level2;

import java.util.Scanner;

// Program to calculate BMI of 10 team members
class BMIChecker {

    // Method to calculate BMI and populate 3rd column
    public static void calculateBMI(double[][] data) {

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightMeters = heightCm / 100;

            data[i][2] = weight / (heightMeters * heightMeters);
        }
    }

    // Method to determine BMI status
    public static String[] getBMIStatus(double[][] data) {

        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];

            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi < 25) {
                status[i] = "Normal";
            } else if (bmi < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double[][] persons = new double[10][3];

        // Input weight and height
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            persons[i][0] = input.nextDouble();

            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            persons[i][1] = input.nextDouble();
        }

        calculateBMI(persons);
        String[] status = getBMIStatus(persons);

        // Display results
        System.out.println("\n--- BMI REPORT ---");
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) +
                    " | Weight: " + persons[i][0] +
                    " kg | Height: " + persons[i][1] +
                    " cm | BMI: " + persons[i][2] +
                    " | Status: " + status[i]);
        }

        input.close();
    }
}

