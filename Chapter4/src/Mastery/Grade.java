package Mastery;

import java.util.Scanner;

public class Grade {

public static void main(String[] args) {
    
	Scanner input = new Scanner(System.in);
    
    // Ask for input
    System.out.print("Please Enter Your Percentage: ");
    int percentage = input.nextInt();
    
    String letterGrade;
    
    // Determine grade
    if (percentage >= 90 && percentage <= 100) {
        letterGrade = "A";
    } else if (percentage >= 80) {
        letterGrade = "B";
    } else if (percentage >= 70) {
        letterGrade = "C";
    } else if (percentage >= 60) {
        letterGrade = "D";
    } else {
        letterGrade = "F";
    }
    
    // Output result
    System.out.println("Your Total Grade Is: " + letterGrade);
  
    
	}

}