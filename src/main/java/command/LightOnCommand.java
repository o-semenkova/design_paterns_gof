package command;

/**
 * Created by osemenkova on 10/10/2016.
 */
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}
