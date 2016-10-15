package command.macrocommand;

import command.Command;

/**
 * Created by osemenkova on 10/15/2016.
 */
public class MacroCommand implements Command {

    Command commands[];

    public MacroCommand(Command commands[]){
        this.commands = commands;
    }

    public void execute() {
        for(int i = 0; i < commands.length; i++){
            commands[i].execute();
        }
    }

    public void undo() {
        for(int i = 0; i < commands.length; i++){
            commands[i].undo();
        }
    }
}
