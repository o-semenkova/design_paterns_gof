package abstract_factory.pizza;

import abstract_factory.ingridients.Cheese;
import abstract_factory.ingridients.Meat;

/**
 * Created by osemenkova on 9/21/2016.
 */
public abstract class Pizza {

    String type;
    String region;
    Cheese cheese;
    Meat meat;

    public abstract void prepare();
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

    public Cheese getCheese() {
        return cheese;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public Meat getMeat() {
        return meat;
    }

    public void setMeat(Meat meat) {
        this.meat = meat;
    }
}
