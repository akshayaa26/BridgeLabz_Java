package coreProgramming.programmingElements.Level1;

import java.util.Scanner;
public class Handshake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // Compute handshake count using combination formula n(n-1)/2
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display result
        System.out.println("The maximum number of possible handshakes is " + handshakes);

        sc.close();

	}

}
