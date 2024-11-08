package _07_collection._04_set;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        SortedSet<Integer> sortedSet = new TreeSet<>(Collections.reverseOrder());
        sortedSet.add(5);
        sortedSet.add(3);
        sortedSet.add(1);
        sortedSet.add(7);
        sortedSet.add(11);
        sortedSet.add(9);
        System.out.println(sortedSet);
        //вернуть компаратор с помощью которого производится сортировка
        //null -если естественный порядок сортировки
        System.out.println(sortedSet.comparator());
        //вернуть первый элемент отсортированного списка
        System.out.println(sortedSet.first());
        //вернуть последний элемент отсортированного списка
        System.out.println(sortedSet.last());
        //вернуть тело списка
        //начало >= конец строго <
        System.out.println(sortedSet.subSet(9,3));
        //вернуть голову списка
        //конец строго <
        System.out.println(sortedSet.headSet(7));
        //вернуть хвост списка
        //начало >=
        System.out.println(sortedSet.tailSet(7));
    }
}
