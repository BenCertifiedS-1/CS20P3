package Mastery;

import java.util.Scanner;

public class Digits 
{

	 public static void main(String[] args) {
	        
	        Scanner input = new Scanner(System.in);
	        
	        // Ask user for input
	        System.out.print("Enter a Three-Digit Number: ");
	        int number = input.nextInt();
	        
	        // Get digits
	        int hundreds = number / 100;
	        int tens = (number / 10) % 10;
	        int ones = number % 10;
	        
	        // Output results
	        System.out.println("The Hundreds Place Digit of Your Number Is: " + hundreds);
	        System.out.println("The Tens Place Digit Is: " + tens);
	        System.out.println("And The Ones Place Digit Is: " + ones);
	        
	        
	        
	    }
	}
