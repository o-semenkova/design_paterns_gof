package bridge;

/**
 * Created by osemenkova on 10/24/2016.
 */
public class PetKitchen {
    public static void main(String []args){

        Food weatFood = new WeatFood("weat food");
        Food dryFood = new DryFood("dry food");
        Pet pug = new Dog(dryFood, "dog", "Batist");
        Cat ekzot = new Cat(weatFood, "cat", "Bosfor");

        pug.tellStory();
        System.out.println();
        ekzot.tellStory();

    }
}
