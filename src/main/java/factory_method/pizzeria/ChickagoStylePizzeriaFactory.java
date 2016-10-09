package factory_method.pizzeria;

import factory_method.pizza.ChikagoCheesePizza;
import factory_method.pizza.ChikagoChickenPizza;
import factory_method.pizza.Pizza;

/**
 * Created by osemenkova on 9/22/2016.
 */
public class ChickagoStylePizzeriaFactory extends AbstractPizzeriaFactory {

    Pizza pizza;

    @Override
    Pizza create(String type) {
        if (type.equals("cheese")){
            pizza = new ChikagoCheesePizza();
            pizza.setType("cheese");
        }else if(type.equals("chicken")){
            pizza = new ChikagoChickenPizza();
            pizza.setType("chicken");
        }
        pizza.setRegion("Chikago");
        return pizza;
    }
}
