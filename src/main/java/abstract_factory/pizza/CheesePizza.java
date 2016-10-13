package abstract_factory.pizza;

import abstract_factory.pizzeria.PizzaIngridientFactory;

/**
 * Created by osemenkova on 9/22/2016.
 */
public class CheesePizza extends Pizza {
    PizzaIngridientFactory pizzaIngridientFactory;

    public CheesePizza(PizzaIngridientFactory pizzaIngridientFactory){
        this.pizzaIngridientFactory = pizzaIngridientFactory;
    }

    public void prepare() {
        cheese = pizzaIngridientFactory.addCheese();
        meat = pizzaIngridientFactory.addMeat();
    }
}
