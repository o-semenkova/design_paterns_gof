package factory;

import factory.pizza.Pizza;
import factory.pizzeria.AbstractPizzeriaFactory;
import factory.pizzeria.ChickagoStylePizzeriaFactory;
import factory.pizzeria.NYStylePizzeriaFactory;

/**
 * Created by osemenkova on 9/22/2016.
 */
public class PizzaCentre {
    public static void main(String []args){
        AbstractPizzeriaFactory pizzaFactory = new NYStylePizzeriaFactory();

        Pizza pizza = pizzaFactory.orderPizza("cheese");
        System.out.println(pizza.getType() + " " + pizza.getRegion() +  " pizza was done");

        pizzaFactory = new ChickagoStylePizzeriaFactory();
        pizza = pizzaFactory.orderPizza("chicken");
        System.out.println(pizza.getType() + " " + pizza.getRegion() +  " pizza was done");
    }
}
