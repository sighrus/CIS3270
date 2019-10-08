package Chapter5;

import java.util.Scanner;

public class ch5Q51 {

	
	
	public static void main(String[] args) {
		//  prompts the user to enter two strings
			
		// and displays the largest common prefix of the two strings.

		int index = 0;				// Initialize index to 0
		String pre = "";
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter first word");
	
	String s1 = input.nextLine();
	
	System.out.println("Enter second word");
	
	String s2 = input.nextLine();
	
	
	while (s1.charAt(index) == s2.charAt(index)) {
		pre += s1.charAt(index);
		index++;
	}

	// Display the result
	if (pre.length() > 0)
		System.out.println("The commmon prefix is " + pre);
	else
		System.out.println(s1 + " and " + s2 +
			" have no commmon prefix");
	
	
	
	
	}

}
