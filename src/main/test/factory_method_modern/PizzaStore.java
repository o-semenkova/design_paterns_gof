package factory_method_modern;

import factory_pattern_modern.pizza.Pizza;
import factory_pattern_modern.pizza.exception.PizzaTypeNotFoundException;

/**
 * Created by osemenkova on 10/10/2016.
 */
public class PizzaStore {
    public static void main(String [] args) throws PizzaTypeNotFoundException {
        Pizza pizza = Pizza.create("NY", "chicken");
        pizza = Pizza.create("NY", "cheese");
        pizza = Pizza.create("Chikago", "chicken");
        pizza = Pizza.create("Chikago", "cheese");
        pizza = Pizza.create("Chik", "cheese");
    }
}
