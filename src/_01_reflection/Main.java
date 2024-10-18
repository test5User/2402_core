package _01_reflection;

import lombok.SneakyThrows;

import java.lang.reflect.InvocationTargetException;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        //Создаем объект определенного типа в котором есть приватное поле и приватный метод
        var obj = new TestReflection();

        //Получаем объект типа class для ранее созданного объекта и у этого объекта с помощью метода getDeclaredField
        //достаем обект типа Field по имени "someField" не обращая внимания на модификатор доступа
        var field = obj.getClass().getDeclaredField("someField");

        //Убираем для этого обекта типа Field модификатор private
        field.setAccessible(true);

        //Задаем значения поля для объекта, который мы создали в самом начале
        field.set(obj, "Vasia Pupkin");

        //Вызываем toString()
        System.out.println(obj);

        //А тут все тоже самое, только для метода
        var method = obj.getClass().getDeclaredMethod("someMethod");
        method.setAccessible(true);

        method.invoke(obj, null);

        //А тут все тоже самое, только для второго метода
        var method1 = obj.getClass().getDeclaredMethod("methodWithArgs", String.class);
        method1.setAccessible(true);
        method1.invoke(obj, new String[]{"qwerty"});
    }
}
