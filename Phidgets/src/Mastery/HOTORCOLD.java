package Mastery;

import com.phidget22.*;

public class HOTORCOLD {

	  public static void main(String[] args) throws Exception {


	        // Create objects
	        TemperatureSensor temperatureSensor = new TemperatureSensor();
	        DigitalOutput redLED = new DigitalOutput();
	        DigitalOutput greenLED = new DigitalOutput();


	        // Address LEDs
	        redLED.setHubPort(1);
	        redLED.setIsHubPortDevice(true);


	        greenLED.setHubPort(4);
	        greenLED.setIsHubPortDevice(true);


	        // Open devices
	        temperatureSensor.open(1000);
	        redLED.open(1000);
	        greenLED.open(1000);


	        while(true) {


	            double temperature = temperatureSensor.getTemperature();


	            // Output exact temperature
	            System.out.println("Temperature: " + temperature + " °C");


	            // Temperature between 20°C and 24°C
	            if(temperature >= 20 && temperature <= 24) {
	                greenLED.setState(true);
	                redLED.setState(false);
	            }
	            else {
	                greenLED.setState(false);
	                redLED.setState(true);
	            }


	            Thread.sleep(150);
	        }
	    }
	}

