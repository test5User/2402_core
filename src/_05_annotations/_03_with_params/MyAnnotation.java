package _05_annotations._03_with_params;

import java.lang.annotation.*;

@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface MyAnnotation {
    String name() default "";
    int value();
}
