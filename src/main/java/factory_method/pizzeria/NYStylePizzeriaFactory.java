package factory_method.pizzeria;

import factory_method.pizza.NYCheesePizza;
import factory_method.pizza.NYChickenPizza;
import factory_method.pizza.Pizza;

/**
 * Created by osemenkova on 9/22/2016.
 */
public class NYStylePizzeriaFactory extends AbstractPizzeriaFactory {
    Pizza pizza;

    @Override
    Pizza create(String type) {
        if (type.equals("cheese")){
            pizza = new NYCheesePizza();
            pizza.setType("cheese");
        }else if(type.equals("chicken")){
            pizza = new NYChickenPizza();
            pizza.setType("chicken");
        }
        pizza.setRegion("NY");
        return pizza;
    }
}
