package Mastery;

import java.util.Scanner;

public class PerfectIntegers {

public static void main(String[] args) {
	        
	        System.out.println("Perfect integers up to 100:");
	        
	        for (int i = 1; i <= 100; i++) {
	            if (isPerfect(i)) {
	                System.out.println(i);
	            }
	        }
	    }

	    public static boolean isPerfect(int num) {
	        
	        int sum = 0;
	        
	        // Find factors
	        for (int i = 1; i < num; i++) {
	            if (num % i == 0) {
	                sum += i;
	            }
	        }
	        
	        return sum == num;
	    }
	}


