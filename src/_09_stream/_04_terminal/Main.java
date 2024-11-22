package _09_stream._04_terminal;

import _09_stream._03_intermediate.WildCat;
import _09_stream._03_intermediate.WildCatAgeComparator;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        var wildCats = List.of(
                new WildCat("Marusia", "f", 2),
                new WildCat("Murzik", "m", 5),
                new WildCat("Zlodey", "m", 3),
                new WildCat("Zlodey", "m", 3),
                new WildCat("Zoya", "f", 10),
                new WildCat("Maria", "f", 50),
                new WildCat("Valera", "m", 35)
        );

        //Количество элементов в стриме
        System.out.println(wildCats.stream().count());
        //Извлечь первый элемент
        System.out.println(wildCats.stream().findFirst().get());
        //Извлечь случайный элемент
        System.out.println(wildCats.stream().findAny().get());
        //все удовлетворяют условию
        System.out.println(wildCats.stream().allMatch(it -> it.getAge() > 5));
        //хотя бы один удовлетворяют условию
        System.out.println(wildCats.stream().anyMatch(it -> it.getAge() > 5));
        //ни один не удовлетворяют условию
        System.out.println(wildCats.stream().noneMatch(it -> it.getAge() < 2));
        //Минимальный элемент
        System.out.println(wildCats.stream()
                .min(new WildCatAgeComparator()).get());
        //Максимальный элемент
        System.out.println(wildCats.stream()
                .max(new WildCatAgeComparator()).get());
        //СведЕние
        System.out.println(wildCats.stream()
                .map(WildCat::getAge)
                .reduce((x, y) -> x + y).get());

        System.out.println(wildCats.stream()
                .map(WildCat::getAge)
                .reduce(1, (x, y) -> x * y));

        // Коллект
        var girls = wildCats.stream()
                .filter(it -> it.getGender().equals("f"))
                .collect(Collectors.toList());
        System.out.println(girls);
        var girlsNew = wildCats.stream()
                .filter(it -> it.getGender().equals("f"))
                .toList();

        var setGirls = wildCats.stream()
                .filter(it -> it.getGender().equals("f"))
                .collect(Collectors.toSet());

        var mapGirls = wildCats.stream()
                .filter(it -> it.getGender().equals("f"))
                .collect(Collectors.toMap(k -> k.getName(), v -> v));
        System.out.println(mapGirls);

        var linkedGirls = wildCats.stream()
                .filter(it -> it.getGender().equals("f"))
                .collect(Collectors.toCollection(LinkedList::new));

        //Параллельный стрим
        var names = wildCats.stream()
                .map(WildCat::getName)
                .collect(Collectors.toList());

        var par = names.parallelStream().sorted().collect(Collectors.toList());
        System.out.println(par);
    }
}
