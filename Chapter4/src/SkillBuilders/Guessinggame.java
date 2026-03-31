package SkillBuilders;

import java.util.Random;
import java.util.Scanner;

public class Guessinggame 
{

	public static void main(String[] args) 
	{	
		Scanner input = new Scanner(System.in);
		
		Random random = new Random();
		
		//Game setup
		int secretNumber = random.nextInt(30) + 1;
		
		//Output
		System.out.println("Guess the number (1-30):");
		System.out.println("Your guess: ");
		
		
		//Single Input
		int guess = input.nextInt();
		
		if (guess == secretNumber)
		{
		System.out.println("Congrats You Got It Right!");
		
		}
		
		else
	
		{
			System.out.println("Incorrect...Sorry");
		}
	
	}
}
