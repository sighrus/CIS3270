package Chapter3;

import java.util.Scanner;

public class ch3Q28 {

	public static void main(String[] args) {
	
		//  prompts the user to enter the
		//center x-, y-coordinates, width, and height of two rectangles and determines
		//whether the second rectangle is inside the first or overlaps with the first

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter r1's center x-, y-coordinates, width and height: ");
		double rx = input.nextDouble();
		double ry = input.nextDouble();
		double rWidth = input.nextDouble();
		double rHeight = input.nextDouble();
		
		System.out.print("Enter r2's center x-, y-coordinates, width and height: ");
		double r2x = input.nextDouble();
		double r2y = input.nextDouble();
		double r2Width = input.nextDouble();
		double r2Height = input.nextDouble();
		
		
		// the calculation..
		
		if	((Math.pow(Math.pow(r2y - ry, 2), .05) + r2Height / 2 <= rHeight / 2) && 
				(Math.pow(Math.pow(r2x - rx, 2), .05) + r2Width / 2 <= rWidth / 2) &&
				(rHeight / 2 + r2Height / 2 <= rHeight) &&
				(rWidth / 2 + r2Width / 2 <= rWidth))
				System.out.println("r2 is inside r1");
			else if ((rx + rWidth / 2 > r2x - r2Width) ||
						(ry + rHeight / 2 > r2y - r2Height))
				System.out.println("r2 overlaps r1");
			else
				System.out.println("r2 does not overlap r1");
		
		
		
		
	}

}
