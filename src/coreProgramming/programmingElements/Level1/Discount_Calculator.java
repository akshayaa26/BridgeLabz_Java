package coreProgramming.programmingElements.Level1;

import java.util.Scanner;
public class Discount_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter fee:");
		double fee=sc.nextDouble();
		System.out.print("Enter discount:");
		double discount=sc.nextDouble();
		double discountamt=(fee*discount)/100;
		double finalfee=fee-discountamt;
		System.out.println("The discount amount is INR " + discountamt +
                " and final discounted fee is INR " + finalfee);
		sc.close();
		
		

	}

}
