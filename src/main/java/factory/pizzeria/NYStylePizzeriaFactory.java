package factory.pizzeria;

import factory.pizza.NYCheesePizza;
import factory.pizza.NYChickenPizza;
import factory.pizza.Pizza;

/**
 * Created by osemenkova on 9/22/2016.
 */
public class NYStylePizzeriaFactory extends AbstractPizzeriaFactory {
    Pizza pizza;

    @Override
    Pizza create(String type) {
        if (type.equals("cheese")){
            pizza = new NYCheesePizza();
        }else if(type.equals("chicken")){
            pizza = new NYChickenPizza();
        }
        return pizza;
    }
}
