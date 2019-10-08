package Chapter5;


import java.util.Scanner;


public class ch5Q17 {

	
	public static void main(String[] args) {
		

		//that prompts the user to enter an integer from 1 to 15 and displays a pyramid :
	
		Scanner input = new Scanner(System.in);
 
		System.out.print("Enter the number of lines: ");
		int numberOfL = input.nextInt();

	
		for (int rows = 1; rows <= numberOfL; rows++) {
			
			// Create spaces in each row
			
			for (int s = numberOfL - rows; s >= 1; s--) {
				System.out.print("  ");
			}
			// Create decending numbers in each row
			
			for (int l = rows; l >= 2; l--) {
				System.out.print(l + " ");
			}
			// Create ascending number in each row
			
			for (int r = 1; r <= rows; r++) {
				System.out.print(r + " ");
			}
			// End line
			System.out.println();
	
	
	}



}
}



