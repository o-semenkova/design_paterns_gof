package factory_method;

/**
 * Created by osemenkova on 9/22/2016.
 */
public class Pizza {
    public static Pizza create(String type){
        Pizza pizza;
        if(type.equals("NY")){
            pizza = new NYPizza();
        }else if(type.equals("Chikago")){
            pizza = new ChikagoPizza();
        }else{
            return null;
        }
        return pizza;
    }
}
