package _08_lambdas._04_predefined;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    static Predicate<Duck> howMoney = duck -> duck.getMoney() > 2_500_000_000L;
    static Predicate<Duck> howGC = duck -> duck.getGrandChild() < 3;

    static Consumer<Duck> printUpper = duck -> System.out.println(duck.getName().toUpperCase());
    static Consumer<Duck> printMoney = duck -> System.out.println(duck.getMoney());

    static Function<Duck, String> convertToString = duck -> duck.getName();
    static Function<Duck, String> convertToMoney = duck -> String.valueOf(duck.getMoney());
    static Function<String, Integer> convertToInt = name -> name.length();

    static Supplier<Duck> returnDuck = () -> new Duck("Scroodge", 2_525_632_125L, 3);

    public static void main(String[] args) {
        List<Duck> list = new ArrayList<>();
        var scroodge = new Duck("Scroodge", 2_525_632_125L, 3);
        System.out.println(howMoney.test(scroodge));
        System.out.println(howMoney.and(howGC).test(scroodge));
        System.out.println(howMoney.or(howGC).test(scroodge));
        System.out.println(howMoney.negate().test(scroodge));
        list.add(scroodge);
        list.stream().filter(duck -> duck.getMoney() > 2_500_000_000L);
        System.out.println("_________________________________________");

        printUpper.accept(scroodge);
        printUpper.andThen(printMoney).accept(scroodge);

        System.out.println("_________________________________________");

        System.out.println(convertToString.apply(scroodge));
        System.out.println(convertToString.andThen(convertToInt).apply(scroodge));

        System.out.println("_________________________________________");

        System.out.println(returnDuck.get());
    }
}
