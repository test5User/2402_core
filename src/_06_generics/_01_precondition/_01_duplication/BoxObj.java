package _06_generics._01_precondition._01_duplication;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BoxObj {
    private Object value;

    public Object doSmth(){
        return value;
    }
}
