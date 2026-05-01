package Mastery;

import java.util.Scanner;

public class DigitsSum {

public static void main(String[] args) {
        
	 	Scanner input = new Scanner(System.in);
	 	
	 	        // Ask for input
	 	        System.out.print("Please Enter a Positive Integer: ");
	 	        int number = input.nextInt();
	 	        
	 	        int sum = 0;
	 	        
	 	        // Add digits
	 	        while (number > 0) {
	 	            int digit = number % 10;  // get last digit
	 	            sum = sum + digit;        // add to sum
	 	            number = number / 10;     // remove last digit
	 	        }
	 	        
	 	        // Output result
	 	        System.out.println("The Sum Of The Digits Is: " + sum);
	 	        
	 	    }
	 	}