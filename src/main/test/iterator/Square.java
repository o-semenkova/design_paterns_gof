package iterator;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by osemenkova on 10/25/2016.
 */
public class Square {
    public static void main(String []args){
        Cat peach = new Cat("ekzot", "Bosfor");
        Cat blue = new Cat("pers", "Maksimus");
        Cat red = new Cat("scotland", "Oscar");

        ArrayList<Cat> cats = new ArrayList<Cat>();
        cats.add(peach);
        cats.add(blue);
        cats.add(red);

        Dog white = new Dog("pug", "Batiston");
        Dog black = new Dog("rizen", "Grant");

        HashSet<Dog> dogs = new HashSet<Dog>();
        dogs.add(white);
        dogs.add(black);

        CatsTradeshow catShow = new CatsTradeshow(cats);
        Iterator catIterator = catShow.getCatIterator();
        while(catIterator.hasNext()){
            System.out.println(catIterator.next().toString());
        }

        DogsTradeshow dogShow = new DogsTradeshow(dogs);
        Iterator dogIterator = dogShow.getDogIterator();
        while (dogIterator.hasNext()){
            System.out.println(dogIterator.next().toString());
        }
    }
}
