package visitor;

/**
 * Created by osemenkova on 10/26/2016.
 */
public class Fruit implements ItemElement {

    private int pricePerKg;
    private int weight;
    private String name;

    public Fruit(int priceKg, int weight, String name){
        this.pricePerKg = priceKg;
        this.weight = weight;
        this.name = name;
    }

    public int getPricePerKg() {
        return pricePerKg;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public int accept(ShoppingCarVisitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "pricePerKg=" + pricePerKg +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
