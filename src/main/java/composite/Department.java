package composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by osemenkova on 10/26/2016.
 */
public class Department extends SupermarketItem {

    private List<SupermarketItem> units;
    private Iterator iterator;

    public Department(String name, String type) {
        super(name, type);
        this.units = new ArrayList<SupermarketItem>();
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

    @Override
    public void print(){
        System.out.println(this.toString());
        System.out.println();
        System.out.println("Items related to " + this.getName() + " " + this.getType() + ":");
        System.out.println("--------------------------");
        Iterator iterator = units.iterator();
        while(iterator.hasNext()){
            SupermarketItem item = (SupermarketItem) iterator.next();
            item.print();
        }
        System.out.println("--------------------------");
    }

    @Override
    public Iterator createIterator() {
        if(this.iterator == null){
            iterator = new CompositeIterator(this.units.iterator());
        }
        return this.iterator;
    }
}
