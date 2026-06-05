package Mastery;

import com.phidget22.*;

public class TUGOFWAR {

public static void main(String[] args) throws Exception {


    // Buttons
    DigitalInput redButton = new DigitalInput();
    DigitalInput greenButton = new DigitalInput();


    // LEDs
    DigitalOutput redLED = new DigitalOutput();
    DigitalOutput greenLED = new DigitalOutput();


    // Addressing
    redButton.setHubPort(0);
    redButton.setIsHubPortDevice(true);


    greenButton.setHubPort(5);
    greenButton.setIsHubPortDevice(true);


    redLED.setHubPort(1);
    redLED.setIsHubPortDevice(true);


    greenLED.setHubPort(4);
    greenLED.setIsHubPortDevice(true);


    // Open devices
    redButton.open(1000);
    greenButton.open(1000);
    redLED.open(1000);
    greenLED.open(1000);


    int redCount = 0;
    int greenCount = 0;


    boolean lastRed = false;
    boolean lastGreen = false;


    boolean gameOver = false;


    while (!gameOver) {


        boolean redState = redButton.getState();
        boolean greenState = greenButton.getState();


        // Count presses (only on press, not hold)
        if (redState && !lastRed) {
            redCount++;
            System.out.println("Red: " + redCount);
        }


        if (greenState && !lastGreen) {
            greenCount++;
            System.out.println("Green: " + greenCount);
        }


        lastRed = redState;
        lastGreen = greenState;


        // Check winner
        if (redCount >= 10) {
            gameOver = true;
            System.out.println("Red Wins!");
            winnerAnimation(redLED, greenLED, redLED);
        }


        if (greenCount >= 10) {
            gameOver = true;
            System.out.println("Green Wins!");
            winnerAnimation(redLED, greenLED, greenLED);
        }


        Thread.sleep(100);
    }
}


// Flash both LEDs once, then winner LED 5 times
public static void winnerAnimation(DigitalOutput redLED,
                                   DigitalOutput greenLED,
                                   DigitalOutput winnerLED) throws Exception {


    // Flash both once
    redLED.setState(true);
    greenLED.setState(true);
    Thread.sleep(300);


    redLED.setState(false);
    greenLED.setState(false);
    Thread.sleep(300);


    // Flash winner LED 5 times
    for (int i = 0; i < 5; i++) {
        winnerLED.setState(true);
        Thread.sleep(300);
        winnerLED.setState(false);
        Thread.sleep(300);
    }
}
}
