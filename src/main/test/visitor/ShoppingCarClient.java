package visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by osemenkova on 10/26/2016.
 */
public class ShoppingCarClient {

    public static void main(String [] args){

        List<ItemElement> goods = new ArrayList<ItemElement>();
        goods.add(new Book(15, "steve"));
        goods.add(new Book(55, "steve with fotos"));
        goods.add(new Fruit(10, 2, "peach"));

        for(ItemElement good : goods){
            System.out.println(good.toString());
        }

        int total = calculatePrice(goods);

        System.out.println("Total sum " + total);
    }

    private static int calculatePrice(List<ItemElement> itemElements){
        ShoppingCarVisitor visitor = new ShoppingCarVisitorImpl();
        int sum = 0;
        for(ItemElement item: itemElements){
            sum = sum + item.accept(visitor);
        }
        return sum;
    }

}
