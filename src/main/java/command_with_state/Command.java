package command_with_state;

/**
 * Created by osemenkova on 10/15/2016.
 */
public interface Command {
    void execute();
    void undo();
}
