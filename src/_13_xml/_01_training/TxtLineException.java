package _13_xml._01_training;

import lombok.Getter;

public class TxtLineException extends Exception{
    @Getter
    private String errorLine;

    public TxtLineException(Throwable cause, String errorLine) {
        super(cause);
        this.errorLine = errorLine;
    }

    @Override
    public String toString() {
        return "Error line: " + errorLine;
    }
}
