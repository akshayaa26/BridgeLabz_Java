package coreProgramming.programmingElements.Level1;

import java.util.Scanner;
public class heightconverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter height:");
		double height=sc.nextDouble();
		double inches=height/2.54;
		int feet=(int)(inches/12);
		double i=inches%12;
		System.out.println("Your Height in cm is " + height +
                " while in feet is " + feet +
                " and inches is " + i);
		sc.close();
	}

}
