package _07_collection._04_set;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {
        NavigableSet<String> navigableSet = new TreeSet<>();
        navigableSet.add("zoom");
        navigableSet.add("apple");
        navigableSet.add("a");
        navigableSet.add("uncle");
        navigableSet.add("cat");
        navigableSet.add("bence");
        System.out.println(navigableSet);
        //Искать наименьший е для которого справедливо e>=obj
        System.out.println(navigableSet.ceiling("ab"));
        //Искать наибольший е для которого справедливо e<=obj
        System.out.println(navigableSet.floor("bf"));
        //Искать наибольший е для которого справедливо e>obj
        System.out.println(navigableSet.higher("bz"));
        //Искать наименьший е для которого справедливо e>obj
        System.out.println(navigableSet.higher("ежик"));
        System.out.println(navigableSet.subSet("bence", false, "uncle", true));
        System.out.println(navigableSet.subSet("bence",  "uncle"));
        //Возвращает первый элемент, удаляя его
        System.out.println(navigableSet.pollFirst());
        System.out.println(navigableSet);
        //Возвращает последний элемент, удаляя его
        System.out.println(navigableSet.pollLast());
        System.out.println(navigableSet);
        //Реверсируем коллекцию
        System.out.println(navigableSet.descendingSet());
    }
}
