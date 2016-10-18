package template_method;

/**
 * Created by osemenkova on 10/18/2016.
 */
public class Tea extends CaffeineBeverage {
    public void addIngridients() {
        System.out.println("Adding lemon");
    }

    public void brew() {
        System.out.println("Steep the tea");
    }

    @Override
    public boolean hook(){
        System.out.println("No addings");
        return false;
    }
}
