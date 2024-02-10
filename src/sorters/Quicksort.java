package sorters;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Quicksort<T> extends Sorter<T> {

    public Quicksort(Comparator<T> _comparator) {
        super(_comparator);
    }

    @Override
    public List<T> sort(List<T> toSort) {
        if (toSort.size() <= 1) {
            return toSort;
        }
        T pivot = toSort.get(toSort.size() - 1);
        List<T> lower = new ArrayList<T>();
        List<T> higher = new ArrayList<T>();
        for (T elem : toSort.subList(0, toSort.size() - 1)) {
            if (compare(elem, pivot) <= 0) {
                lower.add(elem);
            } else {
                higher.add(elem);
            }
        }
        return Stream.concat(sort(lower).stream(), Stream.concat(Stream.of(pivot) ,sort(higher).stream())).toList();
    }

}
