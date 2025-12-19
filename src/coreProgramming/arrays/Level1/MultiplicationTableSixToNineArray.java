package coreProgramming.arrays.Level1;

import java.util.Scanner;

// Program to print multiplication table from 6 to 9 using an array
class MultiplicationTableSixToNineArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Array to store multiplication results (6 to 9)
        int[] multiplicationResult = new int[4];

        // Store results in array
        int index = 0;
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[index] = number * i;
            index++;
        }

        // Display results
        System.out.println("\n--- Multiplication Table (6 to 9) ---");

        index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[index]);
            index++;
        }

        input.close();
    }
}
