package command.commands.light;

import command.Command;

/**
 * Created by osemenkova on 10/13/2016.
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    public void execute() {
        this.light.off();
    }

    public void undo() {
        light.on();
    }
}
