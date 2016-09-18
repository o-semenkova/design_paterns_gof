package decorator;

/**
 * Created by osemenkova on 9/18/2016.
 */
public abstract class Beverage {
    private double price;
    private String size;

    public abstract double cost();
    public void getDescription(){
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
