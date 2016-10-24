package command.commands.stereo;

/**
 * Created by osemenkova on 10/13/2016.
 */
public class Stereo {

    private boolean cdMode;
    private int volume;

    public void on(){
        System.out.println("Stereo ON!");
    }

    public void off(){
        System.out.println("Stereo OFF!");
    }

    public boolean isCdMode() {
        return cdMode;
    }

    public void setCdMode(boolean cdMode) {
        this.cdMode = cdMode;
        System.out.println("Stereo in CD mode");
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Stereo mode set to " + volume);
    }
}
