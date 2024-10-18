package _03_exception._03_own;

import lombok.Getter;

public class FactorialException extends Exception {
    @Getter
    private int number;

    public FactorialException(String message, int number) {
        super(message);
        this.number = number;
    }
}
