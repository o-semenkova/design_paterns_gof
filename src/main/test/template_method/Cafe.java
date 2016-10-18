package template_method;

/**
 * Created by osemenkova on 10/18/2016.
 */
public class Cafe {
    public static void main(String []args){

        CaffeineBeverage tea = new Tea();
        tea.prepare();

        CaffeineBeverage coffee = new Coffee();
        coffee.prepare();
    }
}
