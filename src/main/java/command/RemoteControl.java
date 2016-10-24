package command;

/**
 * Created by osemenkova on 10/13/2016.
 */
public class RemoteControl {
    Command onCommands[];
    Command offCommands[];
    int slots = 7;
    Command undo;

    public RemoteControl(){
        this.onCommands = new Command[slots];
        this.offCommands = new Command[slots];

        Command noCommand = new NoCommand();
        for(int i = 0; i <7; i++){
            this.onCommands[i] = noCommand;
            this.offCommands[i] = noCommand;
        }
        this.undo = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
        this.undo = onCommands[slot];
    }

    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
        this.undo = offCommands[slot];
    }

    public void undoButtonWasPushed(){
        undo.undo();
    }

    public String toString(){
        StringBuffer message = new StringBuffer();
        message.append("\n-----Remote Control-----\n");
        for(int i = 0; i < onCommands.length; i++){
            message.append("[slot " + i + "] "
                    + onCommands[i].getClass().getName() + " "
             + offCommands[i].getClass().getName() + "\n");
        }
        return message.toString();
    }
}
