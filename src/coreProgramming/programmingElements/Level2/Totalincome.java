package coreProgramming.programmingElements.Level2;

import java.util.Scanner;
public class Totalincome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Enter salary amount (INR): ");
        double salary = input.nextDouble();
        System.out.print("Enter bonus amount (INR): ");
        double bonus = input.nextDouble();
        double totalIncome = salary + bonus;
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus +
                           ". Hence Total Income is INR " + totalIncome);

        input.close();


	}

}
