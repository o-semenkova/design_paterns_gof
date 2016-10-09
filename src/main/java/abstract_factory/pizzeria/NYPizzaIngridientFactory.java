package abstract_factory.pizzeria;

import abstract_factory.ingridients.Cheese;
import abstract_factory.ingridients.Meat;
import abstract_factory.ingridients.Mozarella;
import abstract_factory.ingridients.Salami;

/**
 * Created by osemenkova on 10/9/2016.
 */
public class NYPizzaIngridientFactory implements PizzaIngridientFactory {
    public Cheese addCheese() {
        System.out.println("Mozarella was added");
        return new Mozarella();
    }

    public Meat addMeat() {
        System.out.println("Salami was added");
        return new Salami();
    }
}
