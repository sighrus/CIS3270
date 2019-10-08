package Chapter6;

import java.util.Scanner;

public class Chapter2 {

	
	public static void main(String[] args) {
		//write a test program that prompts the user to enter an integer and reports whether the integer is a palindrome.

		
	Scanner input = new Scanner(System.in);
	
		System.out.println("Enter an integer:  ");
		
		int num = input.nextInt();
		
		System.out.println(num + (isPalindrome(num) ? " is " : " is not ") +
				"a palindrome.");
		
	}
		public static boolean isPalindrome(int number) {
			return number == reverse(number) ? true : false;
		}

		 
		public static int reverse(int number) {
			String reverse = ""; 	// Holds reversed number
			String n = number + ""; // Convert number to string
			// Reverse string
			for (int i = n.length() - 1; i >= 0; i--) {
				reverse += n.charAt(i);
			}
			return Integer.parseInt(reverse); // Return reversed integer
	
	
	
	
	}

	
}
