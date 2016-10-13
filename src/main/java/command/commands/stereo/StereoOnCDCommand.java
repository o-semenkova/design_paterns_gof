package command.commands.stereo;

import command.Command;

/**
 * Created by osemenkova on 10/13/2016.
 */
public class StereoOnCDCommand implements Command {
    Stereo stereo;

    public StereoOnCDCommand(Stereo stereo){
        this.stereo = stereo;
    }

    public void execute() {
        this.stereo.on();
        this.stereo.setCdMode(true);
        this.stereo.setVolume(15);
    }

    public void undo() {
        this.stereo.off();
    }
}
