package _07_collection._05_map;

import _07_collection._04_set.Fish;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MainMap {
    public static void main(String[] args) {
        Map<String, Fish> map = new HashMap<>();
        //Удалить все пары ключ-значение
        map.clear();
        //Добавить в мапу
        map.put("Один", new Fish("Пенка", 1));
        map.put("Два", new Fish("Солнышко", 2));
        //Извлечь по ключу
        System.out.println(map.get("Один"));
        System.out.println(map.getOrDefault("Три", new Fish("Fake", 0)));
        //Проверка наличи ключа в мапе
        System.out.println(map.containsKey("Пять"));
        //Проверка наличия значения
        System.out.println(map.containsValue(new Fish("Пенка", 1)));
        //Получить список ключей
        System.out.println(map.keySet());
        //Получить множество значений
        System.out.println(map.values());
        //Список вхождений
        System.out.println(map.entrySet());
        //Проверка на пустоту
        System.out.println(map.isEmpty());
        //Количесво вхождений
        System.out.println(map.size());
        //Добавить другую мапу
        map.putAll(Map.of("Три", new Fish("Волна", 1),
                "Пять", new Fish("Ветерок", 3)));
        //Удалить по ключу
        map.remove("Три");
        System.out.println(map);
        System.out.println("Один".hashCode() & 15);
        System.out.println("Пять".hashCode() & 15);
        System.out.println("Два".hashCode() & 15);

        Map<String, Fish> map1 = new TreeMap<>();
        map1.put("Один", new Fish("Пенка", 1));
        map1.put("Два", new Fish("Солнышко", 2));
    }
}
