package coreProgramming.arrays.Level1;

import java.util.Scanner;

// Program to calculate the mean height of football players
class MeanHeightFootballTeam {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Array to store heights of 11 players
        double[] heights = new double[11];
        double sum = 0.0;

        // Take user input
        System.out.println("Enter the height (in cm) of 11 football players:");

        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i + 1) + " height: ");
            heights[i] = input.nextDouble();
            sum += heights[i];
        }

        // Calculate mean height
        double meanHeight = sum / heights.length;

        // Display result
        System.out.println("\n--- Team Statistics ---");
        System.out.println("Mean height of the football team is: " + meanHeight + " cm");

        input.close();
    }
}
