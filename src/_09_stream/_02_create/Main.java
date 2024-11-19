package _09_stream._02_create;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Пустой стрим
        var empty = Stream.empty();
        //Стрим из коллекции
        var listStream = new ArrayList<>().stream();
        //Стрим из вхождений мапы
        var mapStream = new HashMap<>().entrySet().stream();
        //Стрим из массива
        var arrayStream = Arrays.stream(new int[]{1,2});
        //Стрим из элементов
        var someStream = Stream.of("1", "two", "three");
    }
}
