package strategy.ducks;

import strategy.behavior.FlyBehavior;
import strategy.behavior.QuackBehavior;

/**
 * Created by osemenkova on 9/11/2016.
 */
public abstract class Duck {

    FlyBehavior howToFly;
    QuackBehavior howToQuack;

    public void setHowToFly(FlyBehavior howToFly) {
        this.howToFly = howToFly;
    }

    public void setHowToQuack(QuackBehavior howToQuack) {
        this.howToQuack = howToQuack;
    }

    public  void performFly(){
        howToFly.fly();
    }

    public void performQuack(){
        howToQuack.quack();
    }

    public abstract void displayInfo();
}
