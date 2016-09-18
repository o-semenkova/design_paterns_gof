package decorator;

/**
 * Created by osemenkova on 9/18/2016.
 */
public class Whip extends ExtensionDecorator {
    Beverage beverage;
    Double price = 0.78;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    public void getDescription() {
        beverage.getDescription();
        System.out.println("Whip is added");
    }

    public double cost() {
        return beverage.cost() + price;
    }
}
