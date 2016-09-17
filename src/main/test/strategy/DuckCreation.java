package strategy;

import strategy.ducks.Duck;
import strategy.behavior.FlyNoWay;
import strategy.ducks.MallardDuck;
import strategy.behavior.QuackNoWay;

/**
 * Created by osemenkova on 9/11/2016.
 */
public class DuckCreation {
    public static void main(String args[]){
        Duck duck = new MallardDuck();
        duck.performFly();
        duck.performQuack();
        duck.setHowToFly(new FlyNoWay());
        duck.setHowToQuack(new QuackNoWay());
        duck.performFly();
        duck.performQuack();
    }
}
