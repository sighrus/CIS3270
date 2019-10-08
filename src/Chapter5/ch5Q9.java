package Chapter5;

import java.util.Scanner;

public class ch5Q9 {

	public static void main(String[] args) {
		//  prompts the user to enter the
		//number of students and each student�s name and score, and finally displays the
		//student with the highest score and the student with the second-highest score.
	
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of students: ");
		int numberOfS = input.nextInt();
		
		int score, 						
		 hi = 0, 			
		 secondHi = 0;	
	String name = "", 		
			 student1 = "", 	
			 student2 = "";	
	
	System.out.println("Enter each students' name and score:");
	
	for (int i = 0; i < numberOfS; i++) {
		System.out.print(
			"Student: " + (i + 1) + "\n   Name: ");
		name = input.next();
		System.out.print("   Score: ");
		score = input.nextInt();
		
		if (i == 0) {
			secondHi = hi;
			hi = score;
			student2 = student1;
			student1 = name;
		}
		else if (i == 1 && score > hi) {
			// Second student entered scored
			// higher than first student
			secondHi = hi;
			hi = score;
			student2 = student1;
			student1 = name;
		}
		else if (i == 1) {
			// Second student entered scored
			// lower than first student
			secondHi = score;
			student2 = name;
		}		
		else if (i > 1 && score > hi && score > secondHi) {
			// Last student entered has the highest score 
			secondHi = hi;
			student2 = student1;
			hi = score;
			student1 = name;
		}
		else if (i > 1 && score > secondHi) {
			// Last student entered has the second highest score 
			student2 = name;
			secondHi = score;
		}
	}

		System.out.println(
		"Higest scoring student: " + student1 + 
		"\nSecond Higest scoring student: " + student2);
	}

	}
