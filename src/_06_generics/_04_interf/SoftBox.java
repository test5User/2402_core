package _06_generics._04_interf;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SoftBox<T> implements Wrappable<T> {
    private T value;

    public T doSmth() {
        return value;
    }
}
