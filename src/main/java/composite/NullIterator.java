package composite;

import java.util.Iterator;

/**
 * Created by osemenkova on 10/27/2016.
 */
public class NullIterator implements Iterator {
    public boolean hasNext() {
        return false;
    }

    public Object next() {
        return null;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
