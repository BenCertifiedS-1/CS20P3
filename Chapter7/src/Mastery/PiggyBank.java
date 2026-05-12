package Mastery;

public class PiggyBank {

	    private int pennies;
	    private int nickels;
	    private int dimes;
	    private int quarters;

	    public PiggyBank() {
	        pennies = 0;
	        nickels = 0;
	        dimes = 0;
	        quarters = 0;
	    }

	    public void addPenny() {
	        pennies++;
	    }

	    public void addNickel() {
	        nickels++;
	    }

	    public void addDime() {
	        dimes++;
	    }

	    public void addQuarter() {
	        quarters++;
	    }

	    public double getTotal() {
	        return pennies * 0.01 +
	               nickels * 0.05 +
	               dimes * 0.10 +
	               quarters * 0.25;
	    }

	    public void reset() {
	        pennies = 0;
	        nickels = 0;
	        dimes = 0;
	        quarters = 0;
	    }
	}
