package coreProgramming.programmingElements.Level2;

import java.util.Scanner;
public class TemperatureConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();
        double fahrenheitResult = (celsius * 9.0 / 5.0) + 32;
        System.out.println("The " + celsius + " Celsius is " + fahrenheitResult + " Fahrenheit");

        input.close();

	}

}
