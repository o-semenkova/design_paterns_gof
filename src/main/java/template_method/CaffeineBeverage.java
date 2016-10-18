package template_method;

/**
 * Created by osemenkova on 10/18/2016.
 */
public abstract class CaffeineBeverage {
    public final void boil(){
        System.out.println("Water is boiling");
    }

    public final void pour(){
        System.out.println("Pouring into cup");
    }

    public final void prepare(){
        boil();
        brew();
        pour();
        if(hook()){
            addIngridients();
        }
    }

    public boolean hook(){
        return true;
    }

    public abstract void addIngridients();
    public abstract void brew();

}
