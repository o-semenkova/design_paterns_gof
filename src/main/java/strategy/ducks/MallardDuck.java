package strategy.ducks;

import strategy.behavior.FlyWithWings;
import strategy.behavior.Quack;

/**
 * Created by osemenkova on 9/11/2016.
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        this.howToFly = new FlyWithWings();
        this.howToQuack = new Quack();
    }

    public void displayInfo() {
        System.out.println("I'm a mallard duck");
    }
}
