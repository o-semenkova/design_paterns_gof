package observer;

import java.util.List;

/**
 * Created by osemenkova on 9/14/2016.
 */
public interface Subject {

    void addObserver(Observer newcomer);
    void removeObserver(Observer wantToGoAway);
    void notifyObservers(String temperature, String humidity);
    void notifyObservers();
    boolean setChanged();
    boolean hasChaged();
    void clearChanged();
}
