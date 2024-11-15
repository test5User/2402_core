package _08_lambdas._02_ruls;

public class Main {
    public static void main(String[] args) {
        //Общая форма записи лямбды
        // () - параметры
        // -> -лямбда (метод)
        // {} - тело лямбды
        // () -> {}
        // Без определения целевого типа лямбду использовать нельзя!!!
        //1. Лямбда может иметь 0 или более входных параметров
        ZeroParamsInterface<Integer> l1 = () -> 43;
        OneParamInterface<String> l2 = (str) -> str + "!";
        TwoParamsInterface<Integer> l3 = (x, y) -> x + y;
        VoidInterface<String> l4 = (str) -> System.out.println(str);

        System.out.println(l1.doSmth().getClass().getName());
        System.out.println(l2.doSmth("Hello world"));
        System.out.println(l3.doSmth(56, 32));
        l4.doSmth("Bla-bla");

        //2. Тип параметра может быть явно объявлен, либо выведен из целевого типа
        RawParamsIntrface l5 = (int x, int y) -> x - y;
        System.out.println(l5.doSmth(56, 43));

        //3. Если параметров нет или > 1, то список параметров в скобках
        l1 = () -> 56;
        l2 = str -> str + "?";
        l3 = (x, y) -> x * y;

        System.out.println(l1.doSmth());
        System.out.println(l2.doSmth("Good bye"));
        System.out.println(l3.doSmth(2, 8));

        //4. Если тело из одного выражения, то нет необходимости использовать
        // {} и слово return;
        l3 = (x, y) -> x * y;
        l5 = (int x, int y) -> {return x/y;};

        //5. Если тело состоит более чем из одного выражения, то скобки и return - обязательны!
        l1 = () -> {
            System.out.println("Oh my God!");
            return  56;
        };

        System.out.println(l1.doSmth());

        //6. Если return отсутствует, то возвращаемый тип может быть void.

    }
}
