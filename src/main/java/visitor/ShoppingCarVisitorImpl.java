package visitor;

/**
 * Created by osemenkova on 10/26/2016.
 */
public class ShoppingCarVisitorImpl implements ShoppingCarVisitor {

    public int visit(Book book) {
        int cost;

        if(book.getPrice() > 50){
            cost = book.getPrice()-5;
        }else{
            cost = book.getPrice();
        }
        return cost;
    }

    public int visit(Fruit fruit) {

        int cost = fruit.getPricePerKg() * fruit.getWeight();

        return cost;
    }
}
