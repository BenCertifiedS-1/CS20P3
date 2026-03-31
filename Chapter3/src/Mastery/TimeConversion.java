package Mastery;

import java.util.Scanner;

public class TimeConversion

{

public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Ask for input
        System.out.print("Enter The Time in Minutes: ");
        int minutes = input.nextInt();
        
        // Convert time
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        
        // Output (with formatting)
        if (remainingMinutes < 10) {
            System.out.println("The Time Now Is: " + hours + ":0" + remainingMinutes);
        } else {
            System.out.println("The Time Now Is: " + hours + ":" + remainingMinutes);
        }
        
    }
}
