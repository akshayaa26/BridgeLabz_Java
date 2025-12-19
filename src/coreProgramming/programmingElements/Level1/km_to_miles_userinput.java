package coreProgramming.programmingElements.Level1;

import java.util.Scanner;
public class km_to_miles_userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Km:");
		double km=sc.nextDouble();
		double miles=km/1.6;
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        sc.close();

		

	}

}
