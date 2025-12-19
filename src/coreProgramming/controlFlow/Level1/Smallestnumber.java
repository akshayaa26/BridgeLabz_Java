package coreProgramming.controlFlow.Level1;

import java.util.Scanner;
public class Smallestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);

	        // Taking user inputs
	        System.out.print("Enter first number: ");
	        int number1 = input.nextInt();

	        System.out.print("Enter second number: ");
	        int number2 = input.nextInt();

	        System.out.print("Enter third number: ");
	        int number3 = input.nextInt();

	        // Check if first number is the smallest
	        boolean isSmallest = (number1 < number2) && (number1 < number3);

	        // Output
	        System.out.println("Is the first number the smallest? " + isSmallest);

	        input.close();

	}

}
