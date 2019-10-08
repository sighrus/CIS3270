package Chapter3;

import java.util.Scanner;

public class ch3Q17 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("scissor (0), rock (1), paper (2): ");
	int user = input.nextInt();

	int c = (int)(Math.random() * 3);

	System.out.print("The computer is ");
	switch (c)
	{
		case 0: System.out.print("scissor."); break;
		case 1: System.out.print("rock."); break;
		case 2: System.out.print("paper.");
	}

	System.out.print(" You are ");
	switch (user)
	{
		case 0: System.out.print("scissor"); break;
		case 1: System.out.print("rock"); break;
		case 2: System.out.print("paper ");
	}

	if (c == user)
		System.out.println(" too. It is a draw");
	else
	{
		boolean win = (user == 0 && c == 2) ||
						  (user == 1 && c == 0) ||
						  (user == 2 && c == 1);
		if (win)
			System.out.println(". You won");
		else
			System.out.println(". You lose");
	}
	
	}

}
