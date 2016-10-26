package visitor;

/**
 * Created by osemenkova on 10/26/2016.
 */
public class Book implements ItemElement {

    private int price;
    private String isbnNumber;

    public Book(int cost, String isbn){
        this.price = cost;
        this.isbnNumber = isbn;
    }

    public int getPrice() {
        return price;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public int accept(ShoppingCarVisitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Book{" +
                "price=" + price +
                ", isbnNumber='" + isbnNumber + '\'' +
                '}';
    }
}
