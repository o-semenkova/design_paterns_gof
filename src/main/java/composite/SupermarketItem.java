package composite;

/**
 * Created by osemenkova on 10/26/2016.
 */
public abstract class SupermarketItem {

    private String name;
    private String type;

    public SupermarketItem(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void add(SupermarketItem item){
        throw new UnsupportedOperationException();
    }
    public void remove(SupermarketItem item){
        throw new UnsupportedOperationException();
    }
    public SupermarketItem getChild(int index){
        throw new UnsupportedOperationException();
    }

    public double calculateTotalPrice(int quantity){
        throw new UnsupportedOperationException();
    }

    public double getPricePerSingle(){
        throw new UnsupportedOperationException();
    }

    public String getName(){
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public void print(){
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", type='" + type + '\'';
    }
}
