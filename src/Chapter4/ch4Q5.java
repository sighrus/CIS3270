package Chapter4;

import java.util.Scanner;

public class ch4Q5 {

	public static void main(String[] args) {
		// user to enter the number of sides and their length of a regular polygon and displays its area.

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of sides: ");
		int numberOfS = input.nextInt();
		System.out.print("Enter the side: ");
		double side = input.nextDouble();

		// Compute the area of a regular polygon
		double area = (numberOfS * Math.pow(side, 2) / (4*Math.tan(Math.PI/numberOfS)));

		// Display result
		System.out.println("The area of the polygon is " + area);
		
		
		
		
		
		
		
		
		
	}

}
