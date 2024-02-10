package sorters;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Bogosort<T> extends Sorter<T>{

    public Bogosort(Comparator<T> _comparator) {
        super(_comparator);
    }

    @Override
    public List<T> sort(List<T> toSort) {
        boolean sorted = false;
        List<T> result = new ArrayList<T>();
        while (!sorted) {
            result = new ArrayList<T>();
            List<T> temp = new ArrayList<>(toSort);
            while (temp.size() > 0) {
                int index = ThreadLocalRandom.current().nextInt(0, temp.size());
                result.add(temp.remove(index));
            }
            sorted = isSorted(result);
        }
        return result;
    }

    public boolean isSorted(List<T> list) {
        for (int i =0; i < list.size()-1; i++) {
            if (compare(list.get(i), list.get(i+1)) > 0) { 
                return false;
            }
        }
        return true;
    }
}
