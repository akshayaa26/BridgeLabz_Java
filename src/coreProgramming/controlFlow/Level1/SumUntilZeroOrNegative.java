package coreProgramming.controlFlow.Level1;

import java.util.Scanner;

// Program to find the sum until user enters 0 or a negative number
class SumUntilZeroOrNegative {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double total = 0.0;

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double number = input.nextDouble();

            // Stop condition using break
            if (number <= 0) {
                break;
            }

            // Add number to total
            total += number;
        }

        // Display result
        System.out.println("The total sum of entered numbers is " + total);

        input.close();
    }
}
