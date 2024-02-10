package sorters;
import java.util.Comparator;
import java.util.List;

public abstract class Sorter<T> {

    private Comparator<T> comparator;

    public Sorter (Comparator<T> _comparator) {
        comparator = _comparator;
    }

    public int compare(T x, T y) {
        return comparator.compare(x, y);
    }

    public abstract List<T> sort(List<T> toSort);
}
