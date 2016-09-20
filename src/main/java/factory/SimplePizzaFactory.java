package factory;

/**
 * Created by osemenkova on 9/21/2016.
 */
public class SimplePizzaFactory {
    public Pizza pizza;

    public Pizza createPizza(String type){
        if(type.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setType(type);
            return pizza;
        }else{
            pizza = new ChickenPizza();
            pizza.setType(type);
            return pizza;
        }
    }
}
