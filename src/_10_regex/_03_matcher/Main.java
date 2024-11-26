package _10_regex._03_matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        var pattern = Pattern.compile("M.*d.*l");
        var matcher = pattern.matcher("Model");
        //Нельзя вызвать метод поиска совпадений
        // до того, как был вызван метод старта поиска
        if (matcher.find()) {
            System.out.println(matcher.group());
        }
        /*методы старта поиска
        1. lookingAt - поиск последовательности с начала строки и соотв. шаблону
        matcher.lookingAt()
        2. find() -  поиск последовательности соотв. шаблону
        matcher.find()
        3. find(int n) -  поиск последовательности соотв. шаблону начинающийся с индекса n
        * */

        var pat = Pattern.compile("best");
        var mat = pat.matcher("Java is the best language");

        System.out.println(mat.lookingAt());
        System.out.println(mat.find());
        System.out.println(mat.find(11));

        mat.reset();
        //Изменить паттерн для поиска
        mat.usePattern(Pattern.compile("the"));
        System.out.println(mat.lookingAt());
        System.out.println(mat.find());
        System.out.println(mat.find(6));

        //Сброс матчера в начальное состояние (неопределенность)
        //необходим в случае нескольких поисков на одном объекте матчера
        mat.reset();

        //Заменяет на новую последовательность для обработки
        mat.reset("Python is the best language");
        System.out.println(mat.find());

        // Скобками можно определить группы
        //Метод group() возвращает последовательность, удовл шаблону (по умолчанию = 0)
        var pat2 = Pattern.compile("(java\\w+\\b)");
        var mat2 = pat2.matcher("java java11 python java-8 java_9");
        while (mat2.find()) {
            System.out.println(mat2.group());
        }

        //Групп может быть больше, чем одна в следующем примере их 2
        //метод group(n) выводит конкретную группу (меняйте в методе 1 или 2 и смотрите)
        var pat3 = Pattern.compile("(java\\w+\\b)|(java[^-]\\b)");
        var mat3 = pat3.matcher("java java11 python java-8 java_9");
        while (mat3.find()) {
            System.out.println(mat3.group(2));
        }
    }
}
