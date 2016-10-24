package command_with_state;

/**
 * Created by osemenkova on 10/15/2016.
 */
public class CeilingFan {

    String location;
    FanSpeed speed;

    public CeilingFan(String location){
        this.location = location;
        speed = FanSpeed.OFF;
    }

    public void setSpeed(FanSpeed fanSpeed){
        this.speed = fanSpeed;
        System.out.println("CeilingFan speed is " + this.speed);
    }

    public FanSpeed getSpeed(){
        return this.speed;
    }
}
