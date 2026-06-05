package Mastery;

import com.phidget22.*;

public class BLINKEDP3 {

	public static void main(String[] args) throws Exception {

        DigitalInput redButton = new DigitalInput();

        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);

        redButton.open(1000);

        boolean lastState = redButton.getState();

        while(true){

            boolean currentState = redButton.getState();

            if(currentState != lastState){
                System.out.println("Button State: " + currentState);
                lastState = currentState;
            }

            Thread.sleep(150);
        }
    }
}
