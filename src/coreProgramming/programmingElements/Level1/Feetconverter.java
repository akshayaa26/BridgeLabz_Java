package coreProgramming.programmingElements.Level1;

import java.util.Scanner;
public class Feetconverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);

        // Take input in feet
        System.out.print("Enter the distance in feet: ");
        double feet = sc.nextDouble();

        // Convert to yards and miles
        double yards = feet / 3.0;
        double miles = yards / 1760.0;

        // Display result
        System.out.println("The distance " + feet + " feet is " + yards +
                           " yards and " + miles + " miles");

        sc.close();

	}

}
