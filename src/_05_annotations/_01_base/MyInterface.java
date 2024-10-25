package _05_annotations._01_base;

@FunctionalInterface
public interface MyInterface {
    //Необходимо создать один(единственный) метод без реализации
    void myMethod();

    // Второй метод без реализации нельзя
    //boolean test();

    //Можно метод с реализацией
    default String secondMethod() {
        return "Hello world";
    }
}
