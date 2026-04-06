package Mastery;

import java.util.Scanner;

public class MathTutor 
{


	public static void main(String[] args) {
    
	Scanner input = new Scanner(System.in);
    
	// Generate random numbers (1–10)
    int num1 = (int)(Math.random() * 10) + 1;
    int num2 = (int)(Math.random() * 10) + 1;
    
    // Generate random operator (0–3)
    int operator = (int)(Math.random() * 4);
    
    int correctAnswer = 0;
    String symbol = "";
    
    // Determine operation
    if (operator == 0) {
        correctAnswer = num1 + num2;
        symbol = "+";
    } else if (operator == 1) {
        correctAnswer = num1 - num2;
        symbol = "-";
    } else if (operator == 2) {
        correctAnswer = num1 * num2;
        symbol = "*";
    } else {
        correctAnswer = num1 / num2;
        symbol = "/";
    }
    
    // Ask the question
    System.out.print("Solve This, What Is " + num1 + " " + symbol + " " + num2 + "? ");
    int userAnswer = input.nextInt();
    
    // Check answer
    if (userAnswer == correctAnswer) {
        System.out.println("Thats Correct, Good Job!");
    } else {
        System.out.println("Incorrect. The correct answer is: " + correctAnswer);
    }
    
	}
}
    
    

