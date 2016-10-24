package command.commands.garage_door;

import command.Command;

/**
 * Created by osemenkova on 10/13/2016.
 */
public class GarageDoorClosedCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorClosedCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    public void execute() {
        this.garageDoor.closed();
    }

    public void undo() {
        this.garageDoor.open();
    }
}
