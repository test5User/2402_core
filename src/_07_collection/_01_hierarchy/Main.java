package _07_collection._01_hierarchy;





import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        var cats = new ArrayList<>(List.of(
//                new CollectionCat("Vaska", 10),
//                new CollectionCat("Vaska", 5),
//                new CollectionCat("Vaska", 7),
//                new CollectionCat("Vaska", 1)
//        ));
//
//        cats.removeIf(cat -> cat.getAge()>5);
//        cats.forEach(System.out::println);
        Collection<String> coll = new ArrayList<>();
        //Добавление элемента в коллекцию
        coll.add("First");
        coll.add("Seventh");
        //Добавление в коллекцию другой коллекции
        coll.addAll(List.of("Second", "Third"));
        coll.forEach(System.out::println);
        //Проверка наличия в коллекции определенного объекта
        System.out.println(coll.contains("Second"));
        ///Провека наличия в коллекции нескольких объектов одновременно
        System.out.println(coll.containsAll(List.of("Second", "Fifth")));
        //Количество элементов в коллекции
        coll.size();
        //Проверка, что коллекция пустая
        coll.isEmpty();
        boolean b = coll.size() == 0;
        //Проверка, что коллекция не пустая
        b = coll.size() > 0;
        b = !coll.isEmpty();
        //Удаление одного объекта
        b = coll.remove("Sixth");
        System.out.println(b);
        //Удаление нескольких объектов
        System.out.println("___________________");
        b = coll.removeAll(List.of("Second", "Fifth"));
        System.out.println(b);
        coll.forEach(System.out::println);
        //Удаление одного объекта по некоторому условию
        System.out.println("___________________");
        coll.removeIf(elem -> elem.length() == 5);
        coll.forEach(System.out::println);
        //Оставить в коллекции только элементы, содержащиеся в другой коллекции
        System.out.println("___________________");
        coll.retainAll(List.of("Second", "Fifth"));
        coll.forEach(System.out::println);
    }
}
