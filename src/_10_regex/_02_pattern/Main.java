package _10_regex._02_pattern;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // Создание шаблона
        var pattern = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
        //var pa = Pattern.compile("\\d{3)");

        // Проверка всей строки на соответствие некоему паттерну
        //мы проверяем, что во входной строке только цифры
        System.out.println(Pattern.matches("\\d+", "123a45"));
        System.out.println("123458".matches("\\d+"));

        //Вернуть флаг, переданный в конструктор
        System.out.println(pattern.flags());

        //Разбить строку на лексемы
        var str = "java .net javascript python";
        var pat = Pattern.compile("\\s");
        var arr = pat.split(str, -5);
        for (String aa : arr) {
            System.out.println(aa);
        }
        "java .net javascript python".split("\\s");
    }
}
