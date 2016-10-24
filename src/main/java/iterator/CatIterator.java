package iterator;

import java.util.ArrayList;

/**
 * Created by osemenkova on 10/24/2016.
 */
public class CatIterator implements Iterator {

    private ArrayList<Cat> cats;
    private int position = 0;

    public CatIterator(ArrayList<Cat> cats) {
        this.cats = cats;
    }

    public boolean hasNext() {
        if(this.position >= cats.size() || cats.get(this.position) == null){
            return false;
        }
        return true;
    }

    public Cat next() {
        Cat cat = cats.get(this.position);
        this.position = this.position + 1;
        return cat;
    }
}
