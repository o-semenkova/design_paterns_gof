package composite;

import java.util.Iterator;

/**
 * Created by osemenkova on 10/27/2016.
 */
public class Good extends SupermarketItem {

    private double pricePerSingle;
    private boolean isVegetarian;


    public Good(String name, String type, double pricePerSingle, boolean isVegetarian) {
        super(name, type);
        this.pricePerSingle = pricePerSingle;
        this.isVegetarian = isVegetarian;
    }

    @Override
    public double calculateTotalPrice(int quantity){
        return this.pricePerSingle * quantity;
    }

    @Override
    public double getPricePerSingle(){
        return this.pricePerSingle;
    }

    @Override
    public boolean isVegetarian() {
        return isVegetarian;
    }

    @Override
    public String toString() {
        return ", " +
                "pricePerSingle=" + pricePerSingle +
                ", " + "Vegetarian = " + isVegetarian;
    }

    @Override
    public void print(){
        System.out.println(super.toString() + " " + this.toString());
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }
}
