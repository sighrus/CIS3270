package Chapter5;


public class ch5Q7 {

	
	public static void main(String[] args) {
		//  university is $10,000 this year and increases 5% every year. 
		//In one year, the tuition will be $10,500. 
		//Write a program that computes the tuition in ten years and 
		//total cost of four years� worth of tuition after the tenth year.
	
		int totalCost = 0;							// = total cost of four years 
		int tuition = 10000;
		int tuitionTenthYear=0;
	
		for (int year = 1; year <= 14; year++) {
			
			// Increase tution by 5% every year
			tuition += (tuition * 0.05);  

			if (year > 10)
				
				totalCost += tuition; // Accumulate tution cost

			// Cost of tution - ten years
			
			if (year == 10)
				
				tuitionTenthYear = tuition; 
		
		}
			
			System.out.println("Tuition in ten years: $" + tuitionTenthYear);

			// Display the cost of four years' worth of tution after tenth year
			
			System.out.println("Total cost for four years' worth of tuition" +
				" after the tenth year: $" + totalCost);
			
			
			
		}
}
	