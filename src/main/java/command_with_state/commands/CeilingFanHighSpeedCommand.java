package command_with_state.commands;

import command_with_state.CeilingFan;
import command_with_state.Command;
import command_with_state.FanSpeed;

/**
 * Created by osemenkova on 10/15/2016.
 */
public class CeilingFanHighSpeedCommand implements Command {

    CeilingFan fan;
    FanSpeed prevSpeed;

    public CeilingFanHighSpeedCommand(CeilingFan fan){
        this.fan = fan;
    }

    public void execute() {
        prevSpeed = fan.getSpeed();
        fan.setSpeed(FanSpeed.HIGH);
    }

    public void undo() {
        if(prevSpeed == FanSpeed.HIGH){
            fan.setSpeed(FanSpeed.HIGH);
        }else if(prevSpeed == FanSpeed.MEDIUM){
            fan.setSpeed(FanSpeed.MEDIUM);
        }else if(prevSpeed == FanSpeed.LOW){
            fan.setSpeed(FanSpeed.LOW);
        }else if(prevSpeed == FanSpeed.OFF){
            fan.setSpeed(FanSpeed.OFF);
        }
    }
}
