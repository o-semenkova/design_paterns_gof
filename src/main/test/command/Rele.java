package command;

import command.commands.garage_door.GarageDoor;
import command.commands.garage_door.GarageDoorClosedCommand;
import command.commands.garage_door.GarageDoorOpenCommand;
import command.commands.light.Light;
import command.commands.light.LightOffCommand;
import command.commands.light.LightOnCommand;
import command.commands.stereo.Stereo;
import command.commands.stereo.StereoOffCommand;
import command.commands.stereo.StereoOnCDCommand;

/**
 * Created by osemenkova on 10/10/2016.
 */
public class Rele {

    public static void main(String [] args){
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        GarageDoor door = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(door);
        GarageDoorClosedCommand garageDoorClosedCommand = new GarageDoorClosedCommand(door);

        Stereo stereo = new Stereo();
        StereoOnCDCommand stereoOnCDCommand = new StereoOnCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(1, stereoOnCDCommand, stereoOffCommand);
        remoteControl.setCommand(2, garageDoorOpenCommand, garageDoorClosedCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(0);
        remoteControl.offButtonWasPushed(1);
        remoteControl.offButtonWasPushed(2);
    }
}
