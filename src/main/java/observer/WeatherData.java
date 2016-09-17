package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by osemenkova on 9/14/2016.
 */
public class WeatherData implements Subject {

    private List<Observer> all;
    private String temperature;
    private String humidity;
    private boolean changed = false;


    public WeatherData(String temperature, String humidity){
        all = new ArrayList<Observer>();
        this.humidity = humidity;
        this.temperature = temperature;
    }

    public void addObserver(Observer newcomer) {
        this.all.add(newcomer);
    }

    public void removeObserver(Observer wantToGoAway) {
        int i = all.indexOf(wantToGoAway);
        if(i >= 0){
            this.all.remove(wantToGoAway);
        }
    }

    public void notifyObservers(String temperature, String humidity) {
        if(this.changed){
            for(Observer current: this.all){
                current.update(temperature, humidity);
            }
            clearChanged();
        }
    }

    public void notifyObservers() {
        notifyObservers(null, null);
    }

    public boolean setChanged() {
        return this.changed = true;
    }

    public boolean hasChaged() {
        return this.changed;
    }

    public void clearChanged() {
        this.changed = false;
    }

    public void measurementsChanged(){
        if(temperature.equals("18")){
            setChanged();
        }
        notifyObservers(temperature, humidity);
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
        measurementsChanged();
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
        measurementsChanged();
    }
}
