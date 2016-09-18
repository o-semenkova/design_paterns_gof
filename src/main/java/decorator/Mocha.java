package decorator;

/**
 * Created by osemenkova on 9/18/2016.
 */
public class Mocha extends ExtensionDecorator {

    Beverage beverage;
    Double price = 0.5;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    public void getDescription() {
        beverage.getDescription();
        System.out.println("Mocha is added");
    }

    public double cost() {
        return beverage.cost() + price;
    }
}
