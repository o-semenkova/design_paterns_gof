package abstract_factory.pizzeria;

import abstract_factory.ingridients.Cheese;
import abstract_factory.ingridients.Meat;

/**
 * Created by osemenkova on 10/9/2016.
 */
public interface PizzaIngridientFactory {

    Cheese addCheese();
    Meat addMeat();
}
