package _12_serialization._02_standard;

import java.io.Serializable;

public class Monkey implements Serializable {
    private static String genus = "Monkey";
    private String name;
    private int age;
    private transient String thing;

    public Monkey(String name, int age, String thing) {
        this.name = name;
        this.age = age;
        this.thing = thing;
    }

    @Override
    public String toString() {
        return "Monkey{" +
                "static='" + genus + '\'' +
                "name='" + name + '\'' +
                ", age=" + age +
                ", thing='" + thing + '\'' +
                '}';
    }
}
