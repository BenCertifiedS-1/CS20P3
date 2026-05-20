package Mastery;

public class RandomStats {

public static void main(String[] args) {

        // Array to store occurrences of 0–9
        int[] counts = new int[10];

        // Generate 500 random numbers
        for (int i = 0; i < 500; i++) {

            int number = (int)(Math.random() * 10);

            // Increase count
            counts[number]++;
        }

        // Display results
        System.out.println("Number\tOccurrences");

        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + "\t" + counts[i]);
        }
    }
}
