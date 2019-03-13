package MapFunc;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Create a function called `map` that takes an ArrayList and a `Function<T,R>` object,
 * and returns an ArrayList with all of the elements of the first after the function is applied to them.
 */
public class MapFunc {

    public static <E, R> ArrayList<R> map(ArrayList<E> list, Function<E, R> function){
        Stream<E> stream = list.stream();
        ArrayList<R> mappedList = (ArrayList<R>) stream.map(function).collect(Collectors.toList());
        return  mappedList;
    }
}
