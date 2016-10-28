package state;

/**
 * Created by osemenkova on 10/28/2016.
 */
public interface State {

    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
