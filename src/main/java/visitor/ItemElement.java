package visitor;

/**
 * Created by osemenkova on 10/26/2016.
 */
public interface ItemElement {
    int accept(ShoppingCarVisitor visitor);
}
