package coreProgramming.programmingElements.Level1;

import java.util.Scanner;
public class Square_perimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        // Taking user input
	        System.out.print("Enter the perimeter of the square: ");
	        double perimeter = sc.nextDouble();

	        // Compute side
	        double side = perimeter / 4.0;

	        // Display result
	        System.out.println("The length of the side is " + side +
	                           " whose perimeter is " + perimeter);

	        sc.close();

	}

}
