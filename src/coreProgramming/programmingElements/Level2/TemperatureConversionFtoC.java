package coreProgramming.programmingElements.Level2;

import java.util.Scanner;

public class TemperatureConversionFtoC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double celsiusResult = (fahrenheit - 32) * 5.0 / 9.0;
        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius");

        input.close();

	}

}
