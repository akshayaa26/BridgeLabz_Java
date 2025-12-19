package coreProgramming.arrays.Level2;

import java.util.Scanner;

// Program to create a 2D array, display elements and calculate the sum
class MatrixSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input for rows and columns
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = input.nextInt();

        // Validate input
        if (rows <= 0 || columns <= 0) {
            System.err.println("Invalid input. Rows and columns must be positive.");
            input.close();
            System.exit(0);
        }

        // Declare 2D array
        int[][] matrix = new int[rows][columns];

        // Input matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        int sum = 0;

        // Display matrix and calculate sum
        System.out.println("\n--- Matrix Elements ---");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
                sum += matrix[i][j];
            }
            System.out.println();
        }

        // Display sum
        System.out.println("\nSum of all elements in the matrix: " + sum);

        input.close();
    }
}
