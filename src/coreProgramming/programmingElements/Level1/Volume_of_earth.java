package coreProgramming.programmingElements.Level1;

public class Volume_of_earth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius=6378;
		double miles=radius/1.6;
		double volumekm=(4/3)*Math.PI*Math.pow(radius, 3);
		double volumemiles=(4/3)*Math.PI*Math.pow(miles, 3);
		
		 System.out.println("The volume of Earth in cubic kilometers is " + volumekm +
                 " and in cubic miles is " + volumemiles);


	}

}
