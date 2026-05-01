package Mastery;

import java.util.Scanner;

public class GuessingGame {

public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

		// Generate random number (1–20)
		int target = (int)(Math.random() * 20) + 1;
		int guess = 0;

		// Loop until correct
		while (guess != target) {
    
    System.out.print("Enter a Number Between 1 And 20: ");
    guess = input.nextInt();
    
    if (guess != target) {
        giveHint(guess, target); // call method
    }
}
		System.out.println("YOU WON!");
	}

	// Method to give hint
	public static void giveHint(int guess, int target) {

		if (guess > target) {
    System.out.println("Hint: Try a Lower Number");
		} else {
    System.out.println("Hint: Try a Higher Number");
		}
	}
}


