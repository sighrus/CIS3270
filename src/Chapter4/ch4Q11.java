package Chapter4;

import java.util.Scanner;


public class ch4Q11 {

	
	public static void main(String[] args) {
		
		// prompts the user to enter an integer between
		//0 and 15 and displays its corresponding hex number
	
	Scanner input = new Scanner(System.in);
	
		System.out.println("Type an integer in decimal  between 0 and 15 :");
		
			int deci =input.nextInt();
			
			
			if (deci >= 0 && deci<= 9)
				System.out.println("The hex value is " + deci);
			else if (deci >= 10 && deci <= 15)
				System.out.println("The hex value is " + (char)(deci + 'A' - 10));
			else
				System.out.println(deci + " is an invalid input");
		
			
			
	
	
	
	}

}
