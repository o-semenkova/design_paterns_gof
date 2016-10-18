package template_method;

/**
 * Created by osemenkova on 10/18/2016.
 */
public class Coffee extends CaffeineBeverage {
    public void addIngridients() {
        System.out.println("Adding milk");
    }

    public void brew() {
        System.out.println("Pour the coffee");
    }
}
