package decorator;

/**
 * Created by osemenkova on 9/19/2016.
 */
public class HouseBlend implements Beverage {

    private double price = 1.2;

    public double cost() {
        return price;
    }

    public void getDescription(){
        System.out.println("HouseBlend is ready");
    }
}
