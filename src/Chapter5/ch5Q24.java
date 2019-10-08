package Chapter5;

public class ch5Q24 {

	public static void main(String[] args) {
		// Write a program to sum the following series:
		//1 / 3 + 3 / 5 + 5 / 7 + 7 / 9 + 9 / 11 + 11 / 13 + ... + 95 / 97 + 97 / 99

	
			double sum = 0.0;
			for (double n = 1.0; n <= 97.0; n += 2) {
				sum += n / (n + 2);
			}

			System.out.println(
				"Series: 1 / 3 + 3 / 5 + 5 / 7 + 7 / 9 + 9 / 11 + 11 / 13 + " + 
				" ... + 95 / 97 + 97 / 99");
			System.out.println("Sum of series: " + sum);
		}
	}
	


