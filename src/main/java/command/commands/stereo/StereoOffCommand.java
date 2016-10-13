package command.commands.stereo;

import command.Command;

/**
 * Created by osemenkova on 10/13/2016.
 */
public class StereoOffCommand implements Command {

    Stereo stereo;

    public StereoOffCommand(Stereo stereo){
        this.stereo = stereo;
    }

    public void execute() {
        this.stereo.off();
    }

    public void undo() {
        this.stereo.on();
    }
}
