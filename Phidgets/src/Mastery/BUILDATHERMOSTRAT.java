package Mastery;

import com.phidget22.*;

public class BUILDATHERMOSTRAT {

	public static void main(String[] args) throws Exception {


        // Create objects
        TemperatureSensor temperatureSensor = new TemperatureSensor();


        DigitalInput redButton = new DigitalInput();
        DigitalInput greenButton = new DigitalInput();


        DigitalOutput redLED = new DigitalOutput();
        DigitalOutput greenLED = new DigitalOutput();


        // Address buttons
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);


        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);


        // Address LEDs
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);


        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);


        // Open devices
        temperatureSensor.open(1000);


        redButton.open(1000);
        greenButton.open(1000);


        redLED.open(1000);
        greenLED.open(1000);


        // Starting set temperature
        int setTemperature = 21;


        // Used to detect individual button presses
        boolean lastRedState = false;
        boolean lastGreenState = false;


        // Timer for printing every 10 seconds
        long lastPrintTime = System.currentTimeMillis();


        while (true) {


            double currentTemperature = temperatureSensor.getTemperature();


            // Increase set temperature with green button
            if (greenButton.getState() && !lastGreenState) {
                setTemperature++;
            }


            // Decrease set temperature with red button
            if (redButton.getState() && !lastRedState) {
                setTemperature--;
            }


            lastGreenState = greenButton.getState();
            lastRedState = redButton.getState();


            // Check if current temperature is within 2 degrees
            if (Math.abs(currentTemperature - setTemperature) <= 2) {
                greenLED.setState(true);
                redLED.setState(false);
            } else {
                greenLED.setState(false);
                redLED.setState(true);
            }


            // Print every 10 seconds
            if (System.currentTimeMillis() - lastPrintTime >= 10000) {


                System.out.println("Current Temperature: "
                        + currentTemperature + " °C");


                System.out.println("Set Temperature: "
                        + setTemperature + " °C");


                System.out.println();


                lastPrintTime = System.currentTimeMillis();
            }


            Thread.sleep(100);
        }
    }
}

