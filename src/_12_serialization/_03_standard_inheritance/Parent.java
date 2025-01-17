package _12_serialization._03_standard_inheritance;

import java.io.Serializable;

public class Parent {
    int parentField;

    public Parent() {
        System.out.println("Parent constructor");
        parentField = 5;
    }
}
