package coreProgramming.programmingElements.Level2;

import java.util.Scanner;
public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Enter Principal (INR): ");
        double principal = input.nextDouble();

        System.out.print("Enter Rate of Interest (%): ");
        double rate = input.nextDouble();

        System.out.print("Enter Time (years): ");
        double time = input.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("The Simple Interest is INR " + simpleInterest +
                           " for Principal " + principal +
                           ", Rate of Interest " + rate +
                           "% and Time " + time + " years.");

        input.close();
	}


}
