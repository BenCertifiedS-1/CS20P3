package Mastery;

import com.phidget22.HumiditySensor;
import com.phidget22.TemperatureSensor;

public class READTEMPERATUREANDHUMIDITY {

	public static void main(String[] args) throws Exception {


        HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();


        humiditySensor.open(1000);
        temperatureSensor.open(1000);


        while(true){


            // Humidity
            if(humiditySensor.getHumidity() > 30){
                System.out.println("Humidity: " + humiditySensor.getHumidity() + " %RH");
            } else {
                System.out.println("Humidity is low");
            }


            // Temperature
            if(temperatureSensor.getTemperature() > 21){
                System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C");
            } else {
                System.out.println("Room is too cold");
            }


            Thread.sleep(150);
        }
	}
}


