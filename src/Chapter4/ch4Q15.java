package Chapter4;

import java.util.Scanner;

public class ch4Q15 {

	public static void main(String[] args) {
		// prompts the user to enter a letter and displays its corresponding number
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a letter: ");
		String s = input.nextLine();
		char cha = s.charAt(0);
		cha = Character.toUpperCase(cha);

		//  corresponding number
		
		int number = 0;
		if (Character.isLetter(cha))
		{
			if (cha >= 'Z')
				number = 9;
			else if (cha >= 'S')
				number = 8;
			else if (cha >= 'N')
				number = 7;
			else if (cha >= 'M')
				number = 6;
			else if (cha >= 'J')
				number = 5;
			else if (cha >= 'G')
				number = 4;
			else if (cha >= 'D')
				number = 3;
			else if (cha >= 'A')
				number = 2;
			System.out.println("The corresponding number is " + number);
		}
		else
			System.out.println(cha + " is an invalid input");
		
	{
			
			
			
			
			
		
}

	}
	}