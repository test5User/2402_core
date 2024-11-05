package _07_collection._02_list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        var list = new ArrayList<Integer>();
//        list.add(19);
//        list.add(20);
//        list.add(25);
//        list.forEach(System.out::println);
//        //list.remove(20);
//        System.out.println("___________________________");
//        list.remove(new Integer(20));
//        list.forEach(System.out::println);
        List<Integer> list = new ArrayList<>();
        list.add(19);
        list.add(25);
        list.add(20);
        list.add(1);
        list.add(25);
        //Добавлены расширенные методы по вставке и удалению объектов, используя индексы

        //Извлечение из листа по индексу
        System.out.println(list.get(2));
        //ЛистИтератор - это итератор, который позволяет передвигаться не только вперед, но и назад.
        var literator = list.listIterator();
        //Сортировка листа (в прямом и обратном порядке)
        System.out.println(list);
        list.sort(Integer::compareTo);
        System.out.println(list);
        list.sort(Comparator.reverseOrder());
        System.out.println(list);
        //Подлист - часть листа с-по индекс
        var list1 = list.subList(1, 3);
        System.out.println(list1);
        //Вывод информации об индексе объекта (первого встреченного)
        System.out.println(list.indexOf(25));
        //Вывод информации об индексе объекта (последнего)
        System.out.println(list.lastIndexOf(25));
        //Установление значения элемента по индексу
        list.set(2, 568);
        System.out.println(list);
    }
}
