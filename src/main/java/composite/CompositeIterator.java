package composite;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by osemenkova on 10/27/2016.
 */
public class CompositeIterator implements Iterator {

    Stack stack = new Stack();

    public CompositeIterator(Iterator iterator){
        stack.push(iterator);
    }

    public boolean hasNext() {
        if(stack.empty()){
            return false;
        }else{
            Iterator iterator = (Iterator) stack.peek();
            if(!iterator.hasNext()){
                stack.pop();
                return hasNext();
            }else{
                return true;
            }
        }
    }

    public Object next() {
        if (hasNext()) {
            Iterator iterator = (Iterator) stack.peek();
            SupermarketItem item = (SupermarketItem) iterator.next();
            if (item instanceof Department) {
                stack.push(item.createIterator());
            }
            return item;
        } else {
            return null;
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
