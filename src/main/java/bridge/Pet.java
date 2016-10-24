package bridge;

/**
 * Created by osemenkova on 10/24/2016.
 */
public abstract class Pet {
    private String name;
    private String type;
    private Food food;

    public Pet(Food food, String type, String name){
        this.food = food;
        this.type = type;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void eat(){
        System.out.println(food.getType());
    }

    public void tellStory(){
        System.out.println("My name is " + this.getName());
        System.out.println("I'm " + this.getType());
        System.out.print("My favourite food is ");

        this.eat();
    }
}
