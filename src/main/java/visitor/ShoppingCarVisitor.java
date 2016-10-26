package visitor;

/**
 * Created by osemenkova on 10/26/2016.
 */
public interface ShoppingCarVisitor {

    int visit(Book book);
    int visit(Fruit fruit);
}
