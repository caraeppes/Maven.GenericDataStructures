package Pair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * You need to store two values of type `E`, set them in a constructor, and have the following methods,
 * getFirst
 * getSecond
 * min -> returns the minimum of the pair
 * max -> returns the maximum of the pair
 */
public class Pair<E extends Comparable<E>> {

    List<E> list = new ArrayList<>();

    public Pair(E first, E second) {
        list.add(first);
        list.add(second);
    }

    public E min(){
        return Collections.min(list);
    }

    public E max(){
        return Collections.max(list);
    }

    public E getFirst() {
        return list.get(0);
    }

    public E getSecond() {
        return list.get(1);
    }


}
