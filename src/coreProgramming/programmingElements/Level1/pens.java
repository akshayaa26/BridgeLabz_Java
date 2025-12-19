package coreProgramming.programmingElements.Level1;

public class pens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pens=14;
		int students=3;
		int penperstudent=pens/students;
		int remainingpens=pens%students;
		System.out.print("The Pen Per Student is " + penperstudent +
                " and the remaining pen not distributed is " + remainingpens);

	}

}
