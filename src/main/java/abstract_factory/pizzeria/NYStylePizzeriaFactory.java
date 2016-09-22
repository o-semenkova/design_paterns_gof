package abstract_factory.pizzeria;

import abstract_factory.pizza.NYCheesePizza;
import abstract_factory.pizza.NYChickenPizza;
import abstract_factory.pizza.Pizza;

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
