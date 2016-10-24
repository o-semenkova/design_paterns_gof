package command_with_state;

import command_with_state.commands.CeilingFanHighSpeedCommand;
import command_with_state.commands.CeilingFanLowSpeedCommand;
import command_with_state.commands.CeilingFanMediumSpeedCommand;
import command_with_state.commands.CeilingFanOffCommand;

/**
 * Created by osemenkova on 10/15/2016.
 */
public class RemoteLoader {

    public  static void main(String []args){
        RemoteControl remoteControl = new RemoteControl();
        CeilingFan ceilingFan = new CeilingFan("room");

        CeilingFanLowSpeedCommand ceilingFanLowSpeedCommand = new CeilingFanLowSpeedCommand(ceilingFan);
        CeilingFanMediumSpeedCommand ceilingFanMediumSpeedCommand = new CeilingFanMediumSpeedCommand(ceilingFan);
        CeilingFanHighSpeedCommand ceilingFanHighSpeedCommand = new CeilingFanHighSpeedCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0, ceilingFanLowSpeedCommand, ceilingFanOffCommand);
        remoteControl.setCommand(1, ceilingFanMediumSpeedCommand, ceilingFanOffCommand);
        remoteControl.setCommand(2, ceilingFanHighSpeedCommand, ceilingFanOffCommand);


        remoteControl.onButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
    }
}
