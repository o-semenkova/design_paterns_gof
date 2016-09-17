package observer.visual;

import observer.Observer;
import observer.Subject;

/**
 * Created by osemenkova on 9/15/2016.
 */
public class CurrentState implements  VisualComponent, Observer {

    private String temperature;
    private String humidity;
    private Subject weatherData;

    public CurrentState(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    public void display() {
        System.out.println("CurrentStateView is open");
        System.out.println("Temperature = " + this.temperature);
        System.out.println("Humidity = " + this.humidity);
    }

    public void update(String temperature, String humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
