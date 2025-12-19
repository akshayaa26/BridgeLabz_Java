package coreProgramming.programmingElements.Level1;

public class Student_fee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fee=125000;
		int discount=10;
		double discount_per=(fee*discount)/100;
		double finalFee=fee-discount_per;
		System.out.println("The discount amount is INR " + discount_per +
                " and final discounted fee is INR " + finalFee);
	}

}
