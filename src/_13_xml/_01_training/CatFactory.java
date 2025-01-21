package _13_xml._01_training;

import java.util.Arrays;

public class CatFactory {

    public static CatModel getInstance(String str) throws TxtLineException {
        var split = str.split(",");
        try {
          //Проверяем на количество лексем
          validateArrayLength(split.length);
          //Проверяем id и age что они цифры
          validateByNumber(split[0], split[2]);
          //Проверяем id и age что они положительные
          validateByPositive(split[0], split[2]);
          //Спокойно парсим id, потому что уверены, что данные валидны
          var id = Integer.parseInt(split[0]);
          //Получаем значение для имени (если пустое - пробрасываем исключение)
          var name = validateName(split[1]);
          //Спокойно парсим age, потому что уверены, что данные валидны
          var age = Integer.parseInt(split[2]);
          //Возвращаем объект
          return new CatModel(id, name, age);
        } catch (IllegalStateException e) {
            throw new TxtLineException(e, str);
        }
    }

    private static void validateArrayLength(int length) {
        if (length != 3) {
            throw new IllegalStateException("Wrong line format");
        }
    }

    private static void validateByNumber(String... strings) {
        try {
            Arrays.stream(strings).forEach(Integer::parseInt);
        } catch (NumberFormatException e) {
            throw new IllegalStateException("Id or Age is not a number");
        }
    }

    private static String validateName(String name) {
        if (name.isEmpty()) {
            throw new IllegalStateException("Name is empty");
        }
        return name;
    }

    private static void validateByPositive(String id, String age) {
        if (Integer.parseInt(id) <= 0 || Integer.parseInt(age) <= 0) {
            throw new IllegalStateException("Id or age is negative");
        }
    }
}
