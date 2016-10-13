package abstract_factory.pizzeria;

import abstract_factory.ingridients.Cheese;
import abstract_factory.ingridients.Meat;
import abstract_factory.ingridients.Parmegano;
import abstract_factory.ingridients.Sausage;

/**
 * Created by osemenkova on 10/9/2016.
 */
public class ChikagoPizzaIngridientFactory implements PizzaIngridientFactory {
    public Cheese addCheese() {
        System.out.println("Parmegano was added");
        return new Parmegano();
    }

    public Meat addMeat() {
        System.out.println("Sausage was added");
        return new Sausage();
    }
}
