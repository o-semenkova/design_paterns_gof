package iterator;

import java.util.HashSet;

/**
 * Created by osemenkova on 10/25/2016.
 */
public class DogsTradeshow {
    private HashSet<Dog> dogs;

    public DogsTradeshow(HashSet<Dog> dogs) {
        this.dogs = dogs;
    }

    public Iterator getDogIterator(){
        return new DogIterator(dogs);
    }
}
