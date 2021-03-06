package abstract_factory.pizzeria;

import abstract_factory.pizza.CheesePizza;
import abstract_factory.pizza.ChickenPizza;
import abstract_factory.pizza.Pizza;

/**
 * Created by osemenkova on 9/22/2016.
 */
public class NYStylePizzeriaFactory extends AbstractPizzeriaFactory {
    Pizza pizza;
    PizzaIngridientFactory ingridientFactory = new NYPizzaIngridientFactory();

    @Override
    Pizza create(String type) {
        if (type.equals("cheese")){
            pizza = new CheesePizza(ingridientFactory);
            pizza.setType("cheese");
        }else if(type.equals("chicken")){
            pizza = new ChickenPizza(ingridientFactory);
            pizza.setType("chicken");
        }
        pizza.setRegion("NY");
        return pizza;
    }
}
