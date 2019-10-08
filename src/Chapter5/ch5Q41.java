package Chapter5;


import java.util.Scanner;

public class ch5Q41 {

	public static void main(String[] args) {
		
		// reads integers, finds the largest
		//of them, and counts its occurrences. Assume that the input ends with number
		//0. Suppose that you entered 3 5 2 5 5 5 0; the program finds that the largest
		//is 5 and the occurrence count for 5 is 4.

	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter number : ");
	
	int max = input.nextInt();
	int count = 1;
	int num =0;
	
	while (num > 0) {
		num = input.nextInt();
		if (num > max) {
			max = num;
			count = 1;
		}
		if (num == max)
			count++;
	} 

	// Display to results
	System.out.println("The largest number is " + max);
	System.out.println(
		"The occurrence count of the largest number is " + count);
	
	}
}
