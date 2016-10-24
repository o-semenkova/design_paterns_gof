package iterator;

import java.util.HashSet;

/**
 * Created by osemenkova on 10/25/2016.
 */
public class DogIterator implements Iterator {

    private HashSet<Dog> dogs;
    java.util.Iterator<Dog> it;

    public DogIterator(HashSet<Dog> dogs) {
        this.dogs = dogs;
        this.it = this.dogs.iterator();
    }

    public boolean hasNext() {
        return this.it.hasNext();
    }

    public Dog next() {
        return  this.it.next();
    }
}
