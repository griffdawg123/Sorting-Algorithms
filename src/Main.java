import java.util.*;

import comparators.IntegerComparator;
import comparators.StringComparator;
import sorters.Bogosort;
import sorters.Quicksort;
import sorters.Sorter;

public class Main {
    public static void integerExample() {
        List<Integer> list = new ArrayList<Integer>(List.of(8, 13, 2, 1, 25));
        Comparator<Integer> intCompare = new IntegerComparator();
        Sorter<Integer> sorter = new Quicksort<Integer>(intCompare);
        List<Integer> sorted = sorter.sort(list);
        sorted.stream().forEach(p -> System.out.println(p));
    }
    
    public static void integerMergeExample() {
        List<Integer> list = new ArrayList<Integer>(List.of(8, 13, 2, 1, 25));
        Comparator<Integer> intCompare = new IntegerComparator();
        Sorter<Integer> sorter = new Quicksort<Integer>(intCompare);
        List<Integer> sorted = sorter.sort(list);
        sorted.stream().forEach(p -> System.out.println(p));
    }

    public static void stringExample() {
        List<String> list = new ArrayList<String>(List.of("hello", "world", "wow", "griffin", "foo", "bar", "bazz"));
        Comparator<String> stringCompare = new StringComparator();
        Sorter<String> sorter = new Quicksort<String>(stringCompare);
        List<String> sorted = sorter.sort(list);
        sorted.stream().forEach(p -> System.out.println(p));
    }

    public static void bogoExample() {
        List<String> list = new ArrayList<String>(List.of("hello", "world", "wow", "griffin", "foo", "bar", "bazz"));
        Comparator<String> stringCompare = new StringComparator();
        Sorter<String> sorter = new Bogosort<String>(stringCompare);
        List<String> sorted = sorter.sort(list);
        sorted.stream().forEach(p -> System.out.println(p));
    }

    public static void main(String[] args) {
        bogoExample();
    }
}
