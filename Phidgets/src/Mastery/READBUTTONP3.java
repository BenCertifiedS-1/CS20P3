package Mastery;

import com.phidget22.*;

public class READBUTTONP3 {

	public static void main(String[] args) throws Exception {

        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();

        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);

        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);

        int pressCount = 0;

        boolean lastRedState = false;
        boolean lastGreenState = false;

        while(true){

            if(redButton.getState()){
                redLED.setState(true);
            } else {
                redLED.setState(false);
            }

            if(greenButton.getState()){
                greenLED.setState(true);
            } else {
                greenLED.setState(false);
            }

            if(redButton.getState() && !lastRedState){
                pressCount++;
                System.out.println("Total Presses: " + pressCount);
            }

            if(greenButton.getState() && !lastGreenState){
                pressCount++;
                System.out.println("Total Presses: " + pressCount);
            }

            lastRedState = redButton.getState();
            lastGreenState = greenButton.getState();

            Thread.sleep(150);
        }
    }
}
