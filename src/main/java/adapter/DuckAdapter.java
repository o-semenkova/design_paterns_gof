package adapter;

/**
 * Created by osemenkova on 10/16/2016.
 */
public class DuckAdapter implements Turkey {

    private Duck duck;

    public DuckAdapter(Duck duck){
        this.duck = duck;
    }

    public void gammble() {
        duck.quack();
    }

    public void fly() {
        duck.fly();
    }
}
