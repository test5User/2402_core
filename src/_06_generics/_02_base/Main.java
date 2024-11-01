package _06_generics._02_base;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var boxInt = new GenericsBox<Integer>(123);
        var boxStr = new GenericsBox<>("456");

        int valueInt = boxInt.doSmth();
        String valueStr = boxStr.doSmth();
    }
}
