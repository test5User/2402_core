package _07_collection._05_map;

import _07_collection._04_set.Fish;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        var f1 = new Fish("Пенка", 1);
        var f2 = new Fish("Солнышко", 2);
        var f3 = new Fish("Ветерок", 3);
        var f4 = new Fish("Коралл", 8);

        System.out.println("One".hashCode() & 15);
        System.out.println("Two".hashCode() & 15);
        System.out.println("Three".hashCode() & 15);
        System.out.println("Four".hashCode() & 15);

        //Порядок определяется hash значением ключа
        Map<String, Fish> map = new HashMap<>();
        map.put("One", f1);
        map.put("Two", f2);
        map.put("Three", f3);
        map.put("Four", f4);

        System.out.println(map);

        //Порядок определяется сортирокой по ключам
        Map<String, Fish> map1 = new TreeMap<>();
        map1.put("One", f1);
        map1.put("Two", f2);
        map1.put("Three", f3);
        map1.put("Four", f4);

        System.out.println(map1);

        //Порядок хранения определяется порядком вставки
        Map<String, Fish> map2 = new LinkedHashMap<>();
        map2.put("One", f1);
        map2.put("Two", f2);
        map2.put("Three", f3);
        map2.put("Four", f4);

        System.out.println(map2);
    }
}
