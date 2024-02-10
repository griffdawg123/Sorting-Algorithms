package sorters;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Mergesort<T> extends Sorter<T> {

    public Mergesort(Comparator<T> _comparator) {
        super(_comparator);
    }

    @Override
    public List<T> sort(List<T> toSort) {
        if (toSort.size() == 1) {
            return toSort;
        }
        int n = toSort.size();
        int mid = Math.round(n / 2);
        List<T> fh = sort(toSort.subList(0, mid));
        List<T> sh = sort(toSort.subList(mid, toSort.size()));

        return mergeSortedLists(fh, sh);
    }

    private List<T> mergeSortedLists(List<T> fh, List<T> sh) {
        int i = 0;
        int j = 0;
        List<T> result = new ArrayList<T>();
        while (i < fh.size() && j < sh.size()) {
            if (compare(fh.get(i), sh.get(i)) <= 0) {
                result.add(fh.get(i));
                i++;
            } else {
                result.add(sh.get(j));
                j++;
            }
        }
        if (i < fh.size()) {
            result.addAll(fh.subList(i, fh.size()));
        } else if (j < sh.size()) {
            result.addAll(sh.subList(j, sh.size()));
        }
        return result;
    }

}
