package decorator;

/**
 * Created by osemenkova on 9/18/2016.
 */
public class DarkRoast implements Beverage {
    private double price = 0.66;

    public double cost() {
        return price;
    }

    public void getDescription(){
        System.out.println("DarkRoast is ready");
    }
}
