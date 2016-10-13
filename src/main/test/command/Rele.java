package command;

/**
 * Created by osemenkova on 10/10/2016.
 */
public class Rele {

    public static void main(String [] args){
        SimpleRemoteControl control = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand command = new LightOnCommand(light);

        control.setCommand(command);
        control.buttonWasPressed();

        GarageDoor door = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(door);

        control.setCommand(garageDoorOpenCommand);
        control.buttonWasPressed();
    }
}
