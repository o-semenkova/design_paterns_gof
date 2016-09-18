package decorator;

/**
 * Created by osemenkova on 9/18/2016.
 */
public class DarkRoast extends Beverage {

    public DarkRoast(double price){
        this.setPrice(price);
    }

    public double cost() {
        return this.getPrice();
    }

    public void getDescription(){
        System.out.println("DarkRoast is ready");
    }
}
