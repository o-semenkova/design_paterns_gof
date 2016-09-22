package abstract_factory.pizzeria;

import abstract_factory.pizza.ChikagoCheesePizza;
import abstract_factory.pizza.ChikagoChickenPizza;
import abstract_factory.pizza.Pizza;

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
