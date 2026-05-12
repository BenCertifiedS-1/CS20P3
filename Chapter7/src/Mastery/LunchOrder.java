package Mastery;

import java.util.Scanner;

public class LunchOrder {

public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Create food objects
        Food hamburger = new Food(1.85, 9, 33, 1);
        Food salad = new Food(2.00, 1, 11, 5);
        Food fries = new Food(1.30, 11, 36, 4);
        Food soda = new Food(0.95, 0, 38, 0);

        // Variables for totals
        double totalCost = 0;

        // Hamburger
        System.out.print("Enter Number of Hamburgers: ");
        int h = input.nextInt();
        System.out.println("Each Hamburger Has " + hamburger.getFat() +
                "g of Fat, " + hamburger.getCarbs() +
                "g of Carbs, and " + hamburger.getFiber() + "g of Fiber.");
        totalCost += h * hamburger.getPrice();

        // Salad
        System.out.print("Enter Number of Salads: ");
        int s = input.nextInt();
        System.out.println("Each Salad Has " + salad.getFat() +
                "g of Fat, " + salad.getCarbs() +
                "g of Carbs, and " + salad.getFiber() + "g of Fiber.");
        totalCost += s * salad.getPrice();

        // Fries
        System.out.print("Enter Number of Fries: ");
        int f = input.nextInt();
        System.out.println("French Fries Have " + fries.getFat() +
                "g of Fat, " + fries.getCarbs() +
                "g of Carbs, and " + fries.getFiber() + "g of Fiber.");
        totalCost += f * fries.getPrice();

        // Soda
        System.out.print("Enter Number of Sodas: ");
        int d = input.nextInt();
        System.out.println("Each Soda Has " + soda.getFat() +
                "g of Fat, " + soda.getCarbs() +
                "g of Carbs, and " + soda.getFiber() + "g of Fiber.");
        totalCost += d * soda.getPrice();

        // Final total
        System.out.printf("Your Order Comes to a Total of: $%.2f", totalCost);
    }
}
