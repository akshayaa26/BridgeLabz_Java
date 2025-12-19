package coreProgramming.programmingElements.Level2;

import java.util.Scanner;
public class AthleteRounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        System.out.print("Enter side 1 of the park (in meters): ");
        double side1 = input.nextDouble();
        System.out.print("Enter side 2 of the park (in meters): ");
        double side2 = input.nextDouble();
        System.out.print("Enter side 3 of the park (in meters): ");
        double side3 = input.nextDouble();
        double perimeter = side1 + side2 + side3;
        double totalDistance = 5000;
        double rounds = totalDistance / perimeter;
        System.out.println("The total number of rounds the athlete will run is " + rounds +
                           " to complete 5 km.");

        input.close();
  	}

}
