package adapter;

/**
 * Created by osemenkova on 10/16/2016.
 */
public class Pond {
    public static void main(String[] args){
        Duck mallardDuck = new MallardDuck();
        Turkey wildTurkey = new WildTurkey();

        Turkey duckAdapter = new DuckAdapter(mallardDuck);

        mallardDuck.fly();
        mallardDuck.quack();

        wildTurkey.fly();
        wildTurkey.gammble();

        duckAdapter.gammble();
        duckAdapter.fly();
    }
}
