package Mastery;

import com.phidget22.*;

public class READTEMPERATURE {

	public static void main(String[] args) throws Exception {

		HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();


        humiditySensor.open(1000);
        temperatureSensor.open(1000);


        while(true){


            double humidity = humiditySensor.getHumidity();
            double temperature = temperatureSensor.getTemperature();


            // Practice 1: Humidity condition
            if(humidity > 30){
                System.out.println("Humidity: " + humidity + " %RH");
            } else {
                System.out.println("Humidity is low");
            }


            // Practice 2: Temperature condition
            if(temperature > 21){
                System.out.println("Temperature: " + temperature + " °C");
            } else {
                System.out.println("Room is too cold");
            }


            Thread.sleep(150);
        }
    }
}
