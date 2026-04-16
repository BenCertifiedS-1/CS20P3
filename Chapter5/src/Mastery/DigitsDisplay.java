package Mastery;

import java.util.Scanner;

public class DigitsDisplay {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Ask for input
        System.out.print("Please Enter a Positive Integer: ");
        int number = input.nextInt();
        
        // Store digits as a string
        String digits = "";
        
        // Extract digits (backwards)
        while (number > 0) {
            int digit = number % 10;
            digits = digit + digits; // add to front
            number = number / 10;
        }
        
        // Print each digit on a new line
        for (int i = 0; i < digits.length(); i++) {
            System.out.println(digits.charAt(i));
        }
        
    }
}
