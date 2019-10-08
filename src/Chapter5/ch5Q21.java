package Chapter5;

import java.util.Scanner;

public class ch5Q21 {

	public static void main(String[] args) {
		// enter the loan amount and loan period in number of years
		//and displays the monthly and total payments for each interest rate starting from
		//5% to 8%, with an increment of 1/8.
	
	
		Scanner input = new Scanner(System.in);

		System.out.print("Loan Amount: ");
		double loanAmount = input.nextDouble();
		System.out.print("Number of Years: ");
		int numberOfYrs = input.nextInt();


		// Display table header
		System.out.println(
			"Interest Rate    Monthly Payment    Total Payment");
		
		// Display table with interest rates
		for (double i = 5.0; i <= 8; i += 0.125) {
			System.out.printf("%-5.3f", i);
			System.out.print("%           ");
			double monthlyInterestRate = i / 1200;
			double monthlyPayment = loanAmount * monthlyInterestRate / (1
				- 1 / Math.pow(1 + monthlyInterestRate, numberOfYrs * 12));
			System.out.printf("%-19.2f", monthlyPayment);
			System.out.printf("%-8.2f\n",(monthlyPayment * 12) * numberOfYrs);
	
	
	
	
	}

	}
}

