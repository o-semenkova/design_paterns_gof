package command;

/**
 * Created by osemenkova on 10/10/2016.
 */
public interface Command {
    void execute();
    void undo();
}
