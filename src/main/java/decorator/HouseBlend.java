package decorator;

/**
 * Created by osemenkova on 9/19/2016.
 */
public class HouseBlend extends Beverage {

    public HouseBlend(double price){
        this.setPrice(price);
    }

    public double cost() {
        return this.getPrice();
    }

    public void getDescription(){
        System.out.println("HouseBlend is ready");
    }
}
