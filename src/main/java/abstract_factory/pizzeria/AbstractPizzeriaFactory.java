package abstract_factory.pizzeria;

import abstract_factory.pizza.Pizza;

/**
 * Created by osemenkova on 9/21/2016.
 */
public abstract class AbstractPizzeriaFactory {

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = create(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract Pizza create(String type);
}
