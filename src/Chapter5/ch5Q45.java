package Chapter5;

import java.util.Scanner;


public class ch5Q45 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double m;			//mean
	
		double d;			// deviation
		
		double n;          // number
		
		m = d = 0;
	
	
	System.out.print("Enter ten numbers : ");
	
	
	for (int i = 1; i <= 10; i++) {
		n = input.nextDouble();
		m += n;
		d += Math.pow(n, 2); 
	}
	d =  Math.sqrt((d - (Math.pow(m, 2) / 10)) / (10 - 1));
	m /= 10;

	// Display results
	System.out.println("The mean is " + m);
	System.out.printf("The standard deviation is %.5f\\n", d);
	
	
	
	}

}
