package coreProgramming.string.Level3;
import java.util.Scanner;

public class BMIcalculator {

    // Method to calculate BMI and status
    static String[][] calculateBMI(int[][] data) {

        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {

            int weight = data[i][0];
            int heightCm = data[i][1];

            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);
            bmi = Math.round(bmi * 100.0) / 100.0;

            String status;
            if (bmi < 18.5)
                status = "Underweight";
            else if (bmi < 25)
                status = "Normal";
            else if (bmi < 30)
                status = "Overweight";
            else
                status = "Obese";

            result[i][0] = String.valueOf(heightCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.valueOf(bmi);
            result[i][3] = status;
        }

        return result;
    }

    // Method to display result in tabular format
    static void displayResult(String[][] data) {

        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\tStatus");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(
                    data[i][0] + "\t\t" +
                            data[i][1] + "\t\t" +
                            data[i][2] + "\t" +
                            data[i][3]
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] hwData = new int[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.print("\nEnter weight of person " + (i + 1) + " (kg): ");
            hwData[i][0] = sc.nextInt();

            System.out.print("Enter height of person " + (i + 1) + " (cm): ");
            hwData[i][1] = sc.nextInt();
        }

        String[][] bmiResult = calculateBMI(hwData);
        displayResult(bmiResult);

        sc.close();
    }
}

