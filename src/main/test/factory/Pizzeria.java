package factory;

/**
 * Created by osemenkova on 9/21/2016.
 */
public class Pizzeria {

    public static void main(String []args){
        SimplePizzaFactory pizzaFactory = new SimplePizzaFactory();
        Pizza pizza = pizzaFactory.createPizza("cheese");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        System.out.println(pizza.getType() + " pizza was done");
    }
}
