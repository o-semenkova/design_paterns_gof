package command;

/**
 * Created by osemenkova on 10/10/2016.
 */
public class SimpleRemoteControl {
    Command slot;

    public void setCommand(Command command){
        this.slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
