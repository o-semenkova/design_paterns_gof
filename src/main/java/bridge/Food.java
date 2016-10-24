package bridge;

/**
 * Created by osemenkova on 10/24/2016.
 */
public abstract class Food {
    private String type;
    public Food(String type){
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
