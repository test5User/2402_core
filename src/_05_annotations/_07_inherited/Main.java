package _05_annotations._07_inherited;

import java.lang.annotation.Annotation;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var parentAnnotations = Parent.class.getAnnotations();
        var childAnnotations = Child.class.getAnnotations();
        System.out.println("Paren annotations size = " + parentAnnotations.length);
        for (Annotation annotation : parentAnnotations) {
            System.out.println(annotation);
        }

        System.out.println("Child annotations size = " + childAnnotations.length);
        Arrays.stream(childAnnotations).forEach(System.out::println);
    }
}
