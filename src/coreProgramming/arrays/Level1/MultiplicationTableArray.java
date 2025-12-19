package coreProgramming.arrays.Level1;

import java.util.Scanner;

// Program to print multiplication table using an array
class MultiplicationTableArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Create array to store multiplication results
        int[] table = new int[10];

        // Store multiplication results in array
        for (int i = 1; i <= table.length; i++) {
            table[i - 1] = number * i;
        }

        // Display multiplication table
        System.out.println("\n--- Multiplication Table ---");

        for (int i = 1; i <= table.length; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        input.close();
    }
}
