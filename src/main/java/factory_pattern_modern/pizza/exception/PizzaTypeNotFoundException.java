package factory_pattern_modern.pizza.exception;

/**
 * Created by osemenkova on 10/10/2016.
 */
public class PizzaTypeNotFoundException extends Exception {
    public PizzaTypeNotFoundException(){
        System.out.println("Pizza type not found");
    }

}
