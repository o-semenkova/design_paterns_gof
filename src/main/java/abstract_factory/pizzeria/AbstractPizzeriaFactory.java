package abstract_factory.pizzeria;

import abstract_factory.pizza.Pizza;

/**
 * Created by osemenkova on 9/21/2016.
 */
public abstract class AbstractPizzeriaFactory {

//    public static void main(String []args){
//        ChikagoPizzaFactory chikagoPizzaFactory = new ChikagoPizzaFactory();
//        Pizza chikagoPizza = chikagoPizzaFactory.createPizza("cheese");
//        chikagoPizza.prepare();
//        chikagoPizza.bake();
//        chikagoPizza.cut();
//        chikagoPizza.box();
//
//        System.out.println(chikagoPizza.getType() + " " + chikagoPizza.getRegion() + " pizza was done");
//
//        NYPizzaFactory nyPizzaFactory = new NYPizzaFactory();
//        Pizza nyPizza = nyPizzaFactory.createPizza("cheese");
//        nyPizza.prepare();
//        nyPizza.bake();
//        nyPizza.cut();
//        nyPizza.box();
//
//        System.out.println(nyPizza.getType() + " " + nyPizza.getRegion()+  " pizza was done");
//    }

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
