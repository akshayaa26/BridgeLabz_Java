package coreProgramming.controlFlow.Level1;

import java.util.Scanner;
public class Divisibleby5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check divisibility
        boolean isDivisible = (number % 5 == 0);

        // Output
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);

        input.close();

	}

}
