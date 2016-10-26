package composite;

import java.util.List;

/**
 * Created by osemenkova on 10/26/2016.
 */
public class Department extends SupermarketItem {

    private List<SupermarketItem> units;

    public Department(String name, String type, List<SupermarketItem> units) {
        super(name, type);
        this.units = units;
    }

    @Override
    public void add(SupermarketItem item) {
        units.add(item);
    }

    @Override
    public void remove(SupermarketItem item) {
        units.remove(item);
    }

    public SupermarketItem getChild(int index) {
        return units.get(index);
    }

}
