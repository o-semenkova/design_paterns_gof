package factory_method;

/**
 * Created by osemenkova on 9/22/2016.
 */
public class PizzaShop {

    public static void main(String args[]){
        Pizza nyPizza = Pizza.create("NY");
        Pizza chikagoPizza = Pizza.create("Chikago");
    }
}
