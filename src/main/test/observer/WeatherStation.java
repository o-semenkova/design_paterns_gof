package observer;

import observer.visual.CurrentState;
import observer.visual.VisualComponent;

/**
 * Created by osemenkova on 9/16/2016.
 */
public class WeatherStation {

    public static void main(String []args) {
        WeatherData weatherData = new WeatherData("10", "65%");

        VisualComponent vc = new CurrentState(weatherData);

        weatherData.setTemperature("15");
        weatherData.setTemperature("16");
        weatherData.setTemperature("18");
    }
}
