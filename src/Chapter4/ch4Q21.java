package Chapter4;

import java.util.Scanner;

public class ch4Q21 {

	public static void main(String[] args) {
		
		// the user to enter a Social Security number in the format DDD-DD-DDDD, where D is a digit. Your program should
		// check whether the input is valid.
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a SSN: ");
		
		
		String Sn = input.nextLine();
	
		
		boolean isValid = 
				(Sn.length() == 11) && 
				(Character.isDigit(Sn.charAt(0))) &&
				(Character.isDigit(Sn.charAt(1))) &&
				(Character.isDigit(Sn.charAt(2))) &&
				(Sn.charAt(3) == '-') &&
				(Character.isDigit(Sn.charAt(4))) &&
				(Character.isDigit(Sn.charAt(5))) &&
				(Character.isDigit(Sn.charAt(7))) &&
				(Sn.charAt(6) == '-') &&
				(Character.isDigit(Sn.charAt(8))) &&
				(Character.isDigit(Sn.charAt(9))) &&
				(Character.isDigit(Sn.charAt(10)));

			// Display result
			System.out.println(Sn + " is " + ((isValid) ? "a valid " : "an invalid ")
				+ "social security number");
		
		
	}

}

	