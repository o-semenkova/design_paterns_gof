package command;

/**
 * Created by osemenkova on 10/10/2016.
 */
public class GarageDoorOpenCommand implements Command{
    GarageDoor garageDoor;

    public  GarageDoorOpenCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.open();
    }
}
