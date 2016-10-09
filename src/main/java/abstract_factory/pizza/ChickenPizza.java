package abstract_factory.pizza;

import abstract_factory.pizzeria.PizzaIngridientFactory;

/**
 * Created by osemenkova on 9/21/2016.
 */
public class ChickenPizza extends Pizza {
    PizzaIngridientFactory pizzaIngridientFactory;

    public ChickenPizza(PizzaIngridientFactory pizzaIngridientFactory){
        this.pizzaIngridientFactory = pizzaIngridientFactory;
    }

    public void prepare() {
        cheese = pizzaIngridientFactory.addCheese();
        meat = pizzaIngridientFactory.addMeat();
    }
}
