package Mastery;

import java.util.Scanner;

public class CountConsonants {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask for input
        System.out.print("Please Enter Text: ");
        String text = input.nextLine();

        int consonantCount = 0;

        // Convert to lowercase
        text = text.toLowerCase();

        // Loop through characters
        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            // Check if character is a letter
            if (Character.isLetter(ch)) {

                // Check if NOT a vowel
                if (ch != 'a' && ch != 'e' && ch != 'i'
                        && ch != 'o' && ch != 'u') {

                    consonantCount++;
                }
            }
        }

        // Output result
        System.out.println("The Number of Consonants in "
                + text + " is " + consonantCount);
    }
}
