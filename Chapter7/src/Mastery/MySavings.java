package Mastery;

import java.util.Scanner;

public class MySavings {

public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        PiggyBank bank = new PiggyBank();
        
        int choice = -1;
        
        while (choice != 0) {
            
            System.out.println("\n1. Show total in bank.");
            System.out.println("2. Add a Penny.");
            System.out.println("3. Add a Nickel.");
            System.out.println("4. Add a Dime.");
            System.out.println("5. Add a Quarter.");
            System.out.println("6. Take Money Out of Bank.");
            System.out.println("Enter 0 to Quit");
            
            System.out.print("Enter Your Choice: ");
            choice = input.nextInt();
            
            if (choice == 1) {
                System.out.println("Total in Bank: $" + bank.getTotal());
                
            } else if (choice == 2) {
                bank.addPenny();
                
            } else if (choice == 3) {
                bank.addNickel();
                
            } else if (choice == 4) {
                bank.addDime();
                
            } else if (choice == 5) {
                bank.addQuarter();
                
            } else if (choice == 6) {
                bank.reset();
                System.out.println("Money Taken Out of The Bank.");
            }
        }
        
        System.out.println("Goodbye!");
    }
}
