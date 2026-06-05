package Mastery;

import com.phidget22.*;

public class BLINKEDP2 {

	public static void main(String[] args) throws Exception {

        DigitalInput greenButton = new DigitalInput();

        greenButton.setHubPort(1);
        greenButton.setIsHubPortDevice(true);

        greenButton.open(1000);

        while(true){
            System.out.println("Green Button State: " + greenButton.getState());
            Thread.sleep(150);
        }
    }
}
