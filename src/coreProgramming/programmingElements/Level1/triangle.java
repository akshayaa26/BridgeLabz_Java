package coreProgramming.programmingElements.Level1;

import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        
	        System.out.print("Enter the base of the triangle (in cm): ");
	        double base = sc.nextDouble();

	        System.out.print("Enter the height of the triangle (in cm): ");
	        double height = sc.nextDouble();

	        double areaSqCm = 0.5 * base * height;

	        double areaSqInches = areaSqCm / 6.4516;

	        System.out.println("The area of the triangle in square centimeters is " + areaSqCm +
	                           " and in square inches is " + areaSqInches);

	        sc.close();

	}

}
