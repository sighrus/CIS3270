package Chapter4;

import java.util.Scanner;


public class ch4Q8 {

	public static void main(String[] args) {
		//  that receives an ASCII code
		//(an integer between 0 and 127) and displays its character.

	
	Scanner input = new Scanner(System.in);
	
	int i;
	
	do {
		
		System.out.print("Enter an ASCII code: ");
		
	 i = input.nextInt();
	
	}
	
	while (i <0 || i > 127 );
	
	char charac = (char)i;
	
	
	// Display ASCII code as characters
	
	System.out.println("The character for ASCII code " + i + " is " + charac);
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
