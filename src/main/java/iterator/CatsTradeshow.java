package iterator;

import java.util.ArrayList;

/**
 * Created by osemenkova on 10/25/2016.
 */
public class CatsTradeshow {
    private ArrayList<Cat> cats;

    public CatsTradeshow(ArrayList<Cat> cats) {
        this.cats = cats;
    }

    public Iterator getCatIterator(){
        return new CatIterator(cats);
    }
}
