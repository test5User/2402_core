package _09_stream._03_intermediate;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        var wildCats = List.of(
                new WildCat("Marusia", "f", 2),
                new WildCat("Murzik", "m", 5),
                new WildCat("Zlodey", "m", 3),
                new WildCat("Zoya", "f", 10),
                new WildCat("Maria", "f", 50),
                new WildCat("Valera", "m", 35)
        );
        //Filter - промежуточная, принимает на вход предикат, оставляет в стриме
        //только элементы соответствующие предикату
        wildCats.stream()
                .filter(it -> it.getGender().equals("f"))
                .filter(it -> it.getName().length() > 4)
                .forEach(System.out::println);

        //map - промежуточная, принимает на вход фанкшн, преобразовывает один тип в другой
        //в результате получается стрим из других элементов

        System.out.println(wildCats.stream()
                .filter(it -> it.getGender().equals("m"))
                .map(WildCat::getName)
                //.forEach(it -> System.out.print(it + ", "));
                .collect(Collectors.joining(", ")));

        //flatMap - стрим из элементов расположенных внутри другого элемента
        var tests = List.of(
                new Test(List.of("t1", "t2")),
                new Test(List.of("t3", "t4"))
        );

        tests.stream()
                .flatMap(it -> it.getList().stream())
                .forEach(it -> System.out.print(it + ", "));
        System.out.println();
        //Сортировка - бывает 2 типов: простая и с компаратором.
        wildCats.stream()
                .sorted()
                .map(WildCat::getName)
                .forEach(it -> System.out.print(it + ", "));
        System.out.println();
        //сортировка по возрасту
        wildCats.stream()
                .sorted(new WildCatAgeComparator())
                .map(WildCat::getName)
                .forEach(it -> System.out.print(it + ", "));
        System.out.println();
        //сортировка по полу
        wildCats.stream()
                .sorted(new WildCatGenderComparator())
                .map(WildCat::getName)
                .forEach(it -> System.out.print(it + ", "));
        System.out.println();
        //ваши извращения... сначала выводим отсортированные больше 10 лет, затем
        //отсортированные меньше 10 лет
        var oldStream = wildCats.stream()
                .filter(it -> it.getAge() >= 10)
                .sorted(new WildCatAgeComparator());
        var youngStream = wildCats.stream()
                .filter(it -> it.getAge() < 10)
                .sorted(new WildCatAgeComparator());
        Stream.concat(oldStream, youngStream)
                .map(WildCat::getAge)
                .forEach(it -> System.out.print(it + ", "));
        System.out.println();
        //Избавление от дубликатов
        wildCats.stream()
                .map(WildCat::getName)
                .forEach(it -> System.out.print(it + ", "));
        System.out.println();
        wildCats.stream()
                .distinct()
                .map(WildCat::getName)
                .forEach(it -> System.out.print(it + ", "));
        System.out.println();
        //пропуск и ограничение количества
        wildCats.stream()
                .skip(3)
                .limit(2)
                .map(WildCat::getName)
                .forEach(it -> System.out.print(it + ", "));
        System.out.println();
        //Экзотический метод
        wildCats.stream()
                .sorted(new WildCatAgeComparator())
                .takeWhile(it -> it.getAge() < 50)
                .map(WildCat::getName)
                .forEach(it -> System.out.print(it + ", "));
        System.out.println();
    }
}
