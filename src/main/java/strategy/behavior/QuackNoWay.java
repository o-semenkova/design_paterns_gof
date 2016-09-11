package strategy.behavior;

/**
 * Created by osemenkova on 9/11/2016.
 */
public class QuackNoWay implements QuackBehavior {
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
