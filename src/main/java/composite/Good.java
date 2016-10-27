package composite;

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

    public boolean isVegetarian() {
        return isVegetarian;
    }

    @Override
    public String toString() {
        String vegetarianCheck;

        if(isVegetarian){
            vegetarianCheck = "Vegeterian";
        }else{
            vegetarianCheck = "Not vegeterian";
        }

        return ", " +
                "pricePerSingle=" + pricePerSingle +
                ", " + vegetarianCheck;
    }

    @Override
    public void print(){
        System.out.println(super.toString() + " " + this.toString());
    }
}
