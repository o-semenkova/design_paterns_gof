package composite;

import java.util.Iterator;

/**
 * Created by osemenkova on 10/27/2016.
 */
public class Manager {
    SupermarketItem allItems;

    public Manager(SupermarketItem allItems) {
        this.allItems = allItems;
    }

    public void printVegetarianGoods(){
        Iterator iterator = this.allItems.createIterator();
        System.out.println("\nVegetarian goods\n-----");
        while(iterator.hasNext()){
            SupermarketItem item = (SupermarketItem) iterator.next();
            try{
                if(item.isVegetarian()){
                    item.print();
                }
            }catch(UnsupportedOperationException e){}
        }
    }

    public void print(){
        this.allItems.print();
    }

    public double calculateTotalPrice(int quantity){
        return allItems.calculateTotalPrice(quantity);
    }

    public void setAllItems(SupermarketItem allItems) {
        this.allItems = allItems;
    }
}
