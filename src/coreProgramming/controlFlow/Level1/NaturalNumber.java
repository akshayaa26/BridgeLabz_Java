package coreProgramming.controlFlow.Level1;

import java.util.Scanner;
public class NaturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if number is a natural number
        if (number > 0) {

            // Compute sum using formula
            int sum = number * (number + 1) / 2;

            // Output
            System.out.println("The sum of " + number + " natural numbers is " + sum);

        } else {
            // Not a natural number
            System.out.println("The number " + number + " is not a natural number");
        }

        input.close();

	}

}
