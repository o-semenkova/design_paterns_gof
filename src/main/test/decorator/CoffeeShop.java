package decorator;

/**
 * Created by osemenkova on 9/18/2016.
 */
public class CoffeeShop {
    public static void main(String []args){
        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.println("Cost for beverage is " + darkRoast.cost());
        darkRoast.getDescription();

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Whip(houseBlend);
        System.out.println("Cost for beverage is " + houseBlend.cost());
        houseBlend.getDescription();
    }
}
