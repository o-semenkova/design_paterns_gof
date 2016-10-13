package factory_pattern_modern.pizza;

import factory_pattern_modern.pizza.exception.PizzaTypeNotFoundException;

/**
 * Created by osemenkova on 9/21/2016.
 */
public class Pizza {

    String type;
    String region;

    public void prepare(){
        System.out.println("Preparing pizza");
    }
    public void bake(){
        System.out.println("Baking pizza");
    }
    public void cut(){
        System.out.println("Cutting pizza");
    }
    public void box(){System.out.println("Boxing pizza");}


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public static Pizza create(String region, String type) throws PizzaTypeNotFoundException {
        Pizza pizza;
        if(region.equals("Chikago")){
            if (type.equals("cheese")){
                pizza = new ChikagoCheesePizza();
                pizza.setType("cheese");
            }else if(type.equals("chicken")){
                pizza = new ChikagoChickenPizza();
                pizza.setType("chicken");
            }else{
                throw new PizzaTypeNotFoundException();
            }
            pizza.setRegion("Chikago");
            return pizza;
        }else if(region.equals("NY")) {
            if (type.equals("cheese")) {
                pizza = new NYCheesePizza();
                pizza.setType("cheese");
            } else if(type.equals("chicken")){
                pizza = new NYChickenPizza();
                pizza.setType("chicken");
            }else{
                throw new PizzaTypeNotFoundException();
            }
            pizza.setRegion("NY");
            return pizza;
        }else{
            throw new PizzaTypeNotFoundException();
        }
    }
}
