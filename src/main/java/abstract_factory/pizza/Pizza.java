package abstract_factory.pizza;

/**
 * Created by osemenkova on 9/21/2016.
 */
public abstract class Pizza {

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
}
