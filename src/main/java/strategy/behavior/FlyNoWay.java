package strategy.behavior;

/**
 * Created by osemenkova on 9/11/2016.
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly!");
    }
}
