package factory;

/**
 * Created by osemenkova on 9/21/2016.
 */
public abstract class Pizza {

    String type;

    public void prepare(){
        System.out.println("Preparing pizza");
    }
    public void bake(){
        System.out.println("Baking pizza");
    }
    public void cut(){
        System.out.println("Cutting pizza");
    }
    public void box(){
        System.out.println("Cutting pizza");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
