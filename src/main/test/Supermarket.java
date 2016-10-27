import composite.Department;
import composite.Good;
import composite.Manager;
import composite.SupermarketItem;

/**
 * Created by osemenkova on 10/27/2016.
 */
public class Supermarket {

    public static void main(String []args){

        SupermarketItem supermarket = new Department("Carrefour", "department store");

        SupermarketItem meatDepartment = new Department("Meat", "department");
        meatDepartment.add(new Good("sausage", "good", 15, false));
        meatDepartment.add(new Good("fresh meat", "good", 35, false));

        SupermarketItem cashDeskGood = new Good("snickers", "good", 5, true);

        supermarket.add(meatDepartment);
        supermarket.add(cashDeskGood);

        Manager man = new Manager(supermarket);
        man.printVegetarianGoods();
        man.print();
        man.setAllItems(cashDeskGood);
        double totalPrice = man.calculateTotalPrice(2);
        System.out.println("Total price = " + totalPrice);
    }
}
